package mybridge.server;

import mybridge.protocal.*;
import xnet.core.server.Session;
import xnet.core.util.IOBuffer;

public class MyBridgeSession extends Session {

	static int READ_HEADER = 0;
	static int READ_BODY = 1;

	SessionHandle handle;
	int currentState = READ_HEADER;

	@Override
	public void complateRead(IOBuffer readBuf, IOBuffer writeBuf) throws Exception {
		if (currentState == READ_HEADER) {
			PacketHeader header = new PacketHeader();
			header.putBytes(readBuf.readBytes(0, readBuf.limit()));
			handle.packetNum = (byte) (header.packetNum + 1);
			readBuf.position(0);
			readBuf.limit(header.packetLen);
			currentState = READ_BODY;
		} else {
			currentState = READ_HEADER;
			handle.onPacketReceived(readBuf, writeBuf);
		}
	}

	@Override
	public void complateWrite(IOBuffer readBuf, IOBuffer writeBuf) throws Exception {
		handle.onPacketSended(readBuf, writeBuf);
	}

	@Override
	public void open(IOBuffer readBuf, IOBuffer writeBuf) throws Exception {
		handle = new SessionHandle(this);
		handle.onPacketInit(readBuf, writeBuf);
	}

	@Override
	public void timeout(IOBuffer readBuf, IOBuffer writeBuf) throws Exception {
	}

	@Override
	public void complateReadOnce(IOBuffer readBuf, IOBuffer writeBuf) throws Exception {
	}

	@Override
	public void complateWriteOnce(IOBuffer readBuf, IOBuffer writeBuf) throws Exception {
	}

	@Override
	public void close() {
	}
}
