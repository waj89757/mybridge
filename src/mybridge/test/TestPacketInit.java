package mybridge.test;

import mybridge.core.packet.Buffer;
import mybridge.core.packet.Packet; 
import junit.framework.TestCase;

public class TestPacketInit extends TestCase {
	public void testGetBytes() {
		byte[] data = { (byte) 0x0a, (byte) 0x34, (byte) 0x2e, (byte) 0x31,
				(byte) 0x2e, (byte) 0x31, (byte) 0x2d, (byte) 0x71,
				(byte) 0x6c, (byte) 0x70, (byte) 0x68, (byte) 0x61,
				(byte) 0x2d, (byte) 0x64, (byte) 0x65, (byte) 0x62,
				(byte) 0x75, (byte) 0x67, (byte) 0x00, (byte) 0x01,
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x3a,
				(byte) 0x23, (byte) 0x3d, (byte) 0x4b, (byte) 0x43,
				(byte) 0x4a, (byte) 0x2e, (byte) 0x43, (byte) 0x00,
				(byte) 0x2c, (byte) 0x82, (byte) 0x08, (byte) 0x02,
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
				(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
				(byte) 0x00, (byte) 0x00

		};
		PacketInit init = new PacketInit();
		init.putBytes(data);
		long start = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			 init.getBytes();
		} 
		System.out.println(System.currentTimeMillis() - start);

	}

	static class PacketInit extends Packet {
		public static byte[] defaultPacket = { (byte) 0xa, (byte) 0x35,
				(byte) 0x2e, (byte) 0x31, (byte) 0x2e, (byte) 0x34,
				(byte) 0x39, (byte) 0x2d, (byte) 0x31, (byte) 0x75,
				(byte) 0x62, (byte) 0x75, (byte) 0x6e, (byte) 0x74,
				(byte) 0x75, (byte) 0x38, (byte) 0x2e, (byte) 0x31, (byte) 0x0,
				(byte) 0x30, (byte) 0x0, (byte) 0x0, (byte) 0x0, (byte) 0x69,
				(byte) 0x73, (byte) 0x26, (byte) 0x5f, (byte) 0x30,
				(byte) 0x6d, (byte) 0x55, (byte) 0x45, (byte) 0x0, (byte) 0xff,
				(byte) 0xf7, (byte) 0x8, (byte) 0x2, (byte) 0x0, (byte) 0x0,
				(byte) 0x0, (byte) 0x0, (byte) 0x0, (byte) 0x0, (byte) 0x0,
				(byte) 0x0, (byte) 0x0, (byte) 0x0, (byte) 0x0, (byte) 0x0,
				(byte) 0x0, (byte) 0x0, (byte) 0x37, (byte) 0x23, (byte) 0x47,
				(byte) 0x7c, (byte) 0x5f, (byte) 0x44, (byte) 0x74,
				(byte) 0x3e, (byte) 0x76, (byte) 0x57, (byte) 0x34,
				(byte) 0x3c, (byte) 0x0 };
		public byte protocalVersion = 10;
		public String serverVersion = "5.1.4\0";
		public long threadId = Thread.currentThread().getId();;
		public byte[] scrambleBuff = new byte[] { 1, 1, 1, 1, 1, 1, 1, 1 };
		public byte filler1 = 0x0;
		public int serverCapabilities = 63487;
		public byte serverLang = 8;
		public int serverStatus = 0;
		public byte[] filler2 = new byte[13];
		public byte[] lastScrambleBuff = new byte[13];

		@Override
		public byte[] getBytes() {
			int len = 45 + serverVersion.length();
			Buffer buf = new Buffer(len);
			buf.writeByte(protocalVersion);
			buf.writeNullString(serverVersion);
			buf.writeUInt32(threadId);
			buf.writeBytes(scrambleBuff);
			buf.writeByte(filler1);
			buf.writeUInt16(serverCapabilities);
			buf.writeByte(serverLang);
			buf.writeUInt16(serverStatus);
			buf.writeBytes(filler2);
			buf.writeBytes(lastScrambleBuff);
			return buf.getBytes();
		}

		@Override
		public void putBytes(byte[] bs) {
		}
	}
}
