package mybridge.test;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String a  = "\0\0\0\0";
		System.out.println(a.length());
		System.out.println(a);
		
		byte b = (byte) 0xff;
		System.out.println((b & 0xff )<<16); 
	}

}
