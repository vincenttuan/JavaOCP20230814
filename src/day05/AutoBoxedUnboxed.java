package day05;

public class AutoBoxedUnboxed {
	public static void main(String[] args) {
		// 自動裝箱與拆箱
		// Java 5 以前
		int a = 10;
		Integer b = Integer.valueOf(20);
		System.out.println(a + b.intValue());
		
		// Java 5(含)以後
		int x = 10;
		Integer y = 20; // 等同 Integer.valueOf(20); 自動裝箱
		System.out.println(x + y); // 等同 x + y.intValue() 自動拆箱
		
	}
}
