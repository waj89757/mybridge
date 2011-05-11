package mybridge.test;

import java.io.UnsupportedEncodingException;

public class MainTest {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String a  = "\0\0\0\0";
		System.out.println(a.length());
		System.out.println(a);
		
		byte b = (byte) 0xff;
		System.out.println((b & 0xff )<<16); 
		String aa = "中国";
		System.out.println(new String(aa.getBytes("gbk"),"gbk"));
	}

}
