package mybridge.storyge.memcache;

import java.util.ArrayList;
import java.util.List;


import mybridge.protocal.packet.Packet;
import mybridge.protocal.packet.PacketCommand;
import mybridge.storyge.Handle;

public class MemcacheHandle implements Handle {
	public List<Packet> doCommand(PacketCommand cmd) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();
		return packetList;
	}

	@Override
	public void init() {
	}
}
