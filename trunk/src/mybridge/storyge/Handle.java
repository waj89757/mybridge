package mybridge.storyge;
 
 
import java.util.List;

import mybridge.protocal.packet.*;

public interface Handle {
	/**
	 * 初始化
	 */
	public void init();
	/**
	 * 执行命令，并返回要发送给client的packet list
	 * @param sql
	 * @return
	 * @throws Exception 
	 */
	public List<Packet> doCommand(PacketCommand cmd) throws Exception;
	/**
	 * 会话结束
	 */
	public void destrory();
}
