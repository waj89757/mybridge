package mybridge.handle.mysqlproxy;

import java.util.ArrayList;
import java.util.List;

import mybridge.core.handle.IHandle;
import mybridge.core.packet.Packet;
import mybridge.core.packet.PacketCommand;
import mybridge.core.packet.PacketOk;

public class MysqlProxyHandle implements IHandle {
	public List<Packet> executeCommand(PacketCommand cmd) {
		List<Packet> packetList = new ArrayList<Packet>();

		if (cmd.type != 3) {
			if (cmd.type == 0x1) {
				return null;
			}
			PacketOk ok = new PacketOk();
			ok.affectedRows = 0;
			packetList.add(ok);
			return packetList;
		}

		return packetList;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void open() {
		// TODO Auto-generated method stub
		
	}

	public void setCharset(String string) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
