package day03;

public class StringEquals {

	public static void main(String[] args) {
		String s1 = new String("Java"); // 配置在 String pool 外
		char[] c1 = {'J', 'a', 'v', 'a'};
		String s2 = new String(c1); // 配置在 String pool 外
		String s3 = "Java"; // 配置在 String pool 內 
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s1 == s2 得到 " + (s1 == s2));
		System.out.println("s1.equals(s2) 得到 " + s1.equals(s2));
		
		System.out.println("s3 == s2 得到 " + (s3 == s2));
		s2 = s2.intern(); // 將 s2 配置在 String pool 內, 若有相同內容的字串則共用
		System.out.println("s3 == s2 得到 " + (s3 == s2));

	}

}
