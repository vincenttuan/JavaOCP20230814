package day20;

public class CallStackDemo1 {

	public static void main(String[] args) {
		System.out.println("begin");
		int x = 10;
		int y = 0;
		div(x, y);
		System.out.println("end");
	}
	
	public static void div(int x, int y) {
		try {
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
