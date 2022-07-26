package StringHandling;

public class StringBuffer {

public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println("Length" +sb.length());
		System.out.println("Capacity" +sb.capacity());
		System.out.println(sb.charAt(0));
		sb.setCharAt(0, 'J');
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb2);
		sb2.replace(0, 4, "C");
		System.out.println(sb2);
		
		

	}

	private void replace(int i, int j, String string) {
		
		
	}

	private char[] reverse() {
		
		return null;
	}

	private void setCharAt(int i, char c) {
		
		
	}

	private char[] charAt(int i) {
		
		return null;
	}

	private String length() {
		
		return null;
	}

	private String capacity() {
		
		return null;
	}

}
