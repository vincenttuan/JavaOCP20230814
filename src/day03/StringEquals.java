package day03;

public class StringEquals {

	public static void main(String[] args) {
		String s1 = new String("Java");
		char[] c1 = {'J', 'a', 'v', 'a'};
		String s2 = new String(c1);
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s1 == s2 得到 " + (s1 == s2));
		System.out.println("s2.equals(s2) 得到 " + s2.equals(s2));
		
		

	}

}
