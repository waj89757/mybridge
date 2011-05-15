package mybridge.core.handle;

import java.util.List;

import mybridge.core.packet.Packet;
import mybridge.core.packet.PacketCommand;

public interface IHandle {
	public List<Packet> executeCommand(PacketCommand cmd);
}
