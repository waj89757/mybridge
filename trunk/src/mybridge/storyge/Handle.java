package mybridge.storyge;
 
 
import java.util.List;

import mybridge.protocal.packet.*;

public interface Handle {
	/**
	 * 执行过滤器，并返回要发送给client的packet list
	 * @param sql
	 * @return
	 * @throws Exception 
	 */
	public List<Packet> doCommand(PacketCommand cmd) throws Exception;
}
