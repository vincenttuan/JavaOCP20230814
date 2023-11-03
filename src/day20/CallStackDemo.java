package day20;

public class CallStackDemo {

	public static void main(String[] args) {
		first();
	}
	
	public static void first() {
		second();
	}
	
	public static void second() {
		third();
	}
	
	public static void third() {
		System.out.println(10/0);
	}

}
