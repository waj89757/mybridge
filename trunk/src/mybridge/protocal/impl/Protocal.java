package mybridge.protocal.impl;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import xnet.core.util.IOBuffer;
import mybridge.protocal.packet.*;
import mybridge.server.MyBridgeSession;
import mybridge.storyge.Handle;

public class Protocal {
	static Log logger = LogFactory.getLog(Protocal.class);
	public static Class<?> handleClass;

	Handle handle;
	MyBridgeSession session;//链接对应的session
	State state;//当前协议交互状态
	public byte packetNum = 0;//下一个packet的序列号
	Iterator<Packet> resultIter = null;//要写的packet迭代器，只要不为空就会一直写状态直到为空

	public Protocal(MyBridgeSession session) throws InstantiationException, IllegalAccessException {
		this.session = session;
		state = State.WRITE_INIT;
		handle = (Handle) handleClass.newInstance();
		handle.init();
	}

	/**
	 * 链接建立事件
	 * @param readBuf
	 * @param writeBuf
	 */
	public void onSessionOpen(IOBuffer readBuf, IOBuffer writeBuf) {
		PacketInit init = new PacketInit();
		init.putBytes(PacketInit.defaultPacket);
		writePacket(writeBuf, init);
	}
	/**
	 * session关闭事件
	 */
	public void onSessionClose() {
		handle.destrory();
	}

	/**
	 * 读完一个packet事件
	 * @param readBuf
	 * @param writeBuf
	 */
	public void onPacketReceived(IOBuffer readBuf, IOBuffer writeBuf) {
		logger.debug("DEBUG ENTER");

		switch (state) {
		case READ_AUTH:
			state = State.WRITE_RESULT;
			PacketAuth auth = new PacketAuth();
			auth.putBytes(readBuf.getBytes(0, readBuf.limit()));
			PacketOk ok = new PacketOk();
			ok.type = 0;
			ok.serverStatus = 0;
			ok.message = "welcom to mybridge designed by quanwei";
			writePacket(writeBuf, ok);
			break;
		case READ_COMMOND:
			state = State.WRITE_RESULT;
			PacketCommand cmd = new PacketCommand();
			cmd.putBytes(readBuf.getBytes(0, readBuf.limit()));
			try {
				List<Packet> resultList = handle.doCommand(cmd);
				if (resultList == null || resultList.size() == 0) {
					session.setNextState(MyBridgeSession.STATE_CLOSE);
					return;
				}
				resultIter = resultList.iterator();
			} catch (Exception e) {
				e.printStackTrace();
				session.setNextState(MyBridgeSession.STATE_CLOSE);
				return;
			}
			if (resultIter.hasNext()) {
				Packet packet = resultIter.next();
				writePacket(writeBuf, packet);
			}
			break;
		default:
			session.setNextState(MyBridgeSession.STATE_CLOSE);
		}
	}

	/**
	 * 写完一个packet事件
	 * @param readBuf
	 * @param writeBuf
	 */
	public void onPacketSended(IOBuffer readBuf, IOBuffer writeBuf) {
		logger.debug("DEBUG ENTER");

		switch (state) {
		case WRITE_INIT:
			state = State.READ_AUTH;
			readPacket(readBuf);
			break;
		case WRITE_RESULT:
			if (resultIter != null && resultIter.hasNext()) {
				Packet packet = resultIter.next();
				writePacket(writeBuf, packet);
			} else {
				state = State.READ_COMMOND;
				readPacket(readBuf);
			}
			break;
		default:
			session.setNextState(MyBridgeSession.STATE_CLOSE);
		}
	}

	/**
	 * 写一个packet
	 * @param writeBuf
	 * @param packet
	 */
	public void writePacket(IOBuffer writeBuf, Packet packet) {
		logger.debug("DEBUG ENTER");

		byte[] bodyBytes = packet.getBytes();
		PacketHeader header = new PacketHeader();
		header.packetLen = bodyBytes.length;
		header.packetNum = packetNum;
		packetNum++;

		writeBuf.position(0);
		writeBuf.writeBytes(header.getBytes());
		writeBuf.writeBytes(bodyBytes);
		writeBuf.limit(writeBuf.position());
		writeBuf.position(0);
		session.setNextState(MyBridgeSession.STATE_WRITE);
	}

	/**
	 * 读一个packet
	 * @param readBuf
	 */
	public void readPacket(IOBuffer readBuf) {
		logger.debug("DEBUG ENTER");

		readBuf.position(0);
		readBuf.limit(4);
		session.setNextState(MyBridgeSession.STATE_READ);
	}

	/**
	 * 状态
	 * @author quanwei
	 *
	 */
	static enum State {
		WRITE_INIT, READ_AUTH, WRITE_RESULT, READ_COMMOND
	}
}
