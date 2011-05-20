package mybridge.core.server;

import java.util.List;

import mybridge.core.packet.Packet;
import mybridge.core.packet.PacketCommand;

public interface MyBridgeHandle {
	public List<Packet> executeCommand(PacketCommand cmd) throws Exception;

	public void open();

	public void close();

	public void setCharset(String charset) throws Exception;

	public void setDb(String db) throws Exception;
}
