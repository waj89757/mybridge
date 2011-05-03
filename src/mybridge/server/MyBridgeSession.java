package mybridge.server;

import mybridge.protocal.impl.Protocal;
import mybridge.protocal.packet.*;
import xnet.core.server.Session;
import xnet.core.util.IOBuffer;

/**
 * 实现mysql协议的session
 * @author quanwei
 *
 */
public class MyBridgeSession extends Session {

	static int READ_HEADER = 0;//正在读packet头，读操作时有效
	static int READ_BODY = 1;//正在读packet body，读操作时有效

	Protocal protocal;//读完或写完1个packet后的协议处理器
	int currentState = READ_HEADER;//初始状态为读packet头

	@Override
	public void complateRead(IOBuffer readBuf, IOBuffer writeBuf) throws Exception {
		if (currentState == READ_HEADER) {
			PacketHeader header = new PacketHeader();
			header.putBytes(readBuf.readBytes(0, readBuf.limit()));
			protocal.packetNum = (byte) (header.packetNum + 1);
			readBuf.position(0);
			readBuf.limit(header.packetLen);
			currentState = READ_BODY;
		} else {
			currentState = READ_HEADER;
			protocal.onPacketReceived(readBuf, writeBuf);
		}
	}

	@Override
	public void complateWrite(IOBuffer readBuf, IOBuffer writeBuf) throws Exception {
		protocal.onPacketSended(readBuf, writeBuf);
	}

	@Override
	public void open(IOBuffer readBuf, IOBuffer writeBuf) throws Exception {
		protocal = new Protocal(this);
		protocal.onPacketInit(readBuf, writeBuf);
	}
}
