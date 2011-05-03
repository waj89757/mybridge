package mybridge.test;

import mybridge.protocal.PacketInit;
import junit.framework.TestCase;

public class TestPacketInit extends TestCase {
	public void testGetBytes() {
		byte[] data =
				{ (byte) 0x0a, (byte) 0x34, (byte) 0x2e, (byte) 0x31,
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
		byte[] exp = init.getBytes();
		for (int i = 0; i < exp.length; i++) {
			assertEquals(null, exp[i], data[i]);
		}

	}
}
