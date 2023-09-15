package day09;

public class OverloadingDemo {
	
	public static void foo(int x) {
		System.out.println("A");
	}
	
	public static void foo(Integer x) {
		System.out.println("C");
	}
	
	public static void foo(int... x) {
		System.out.println("E");
	}
	
	public static void foo(double x) {
		System.out.println("B");
	}
	
	public static void foo(float x) {
		System.out.println("F");
	}
	
	public static void foo(Double x) {
		System.out.println("D");
	}
	
	public static void main(String[] args) {
		foo(100L);
	}

}
