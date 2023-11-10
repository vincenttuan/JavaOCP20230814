package day22;

public class ShoppingMain {

	public static void main(String[] args) {
		// 老婆購物完後的要執行的任務
		ShoppingCallback callback = message -> {
			System.out.println("老婆說: " + message);
			System.out.println("老公去付錢");
		};
		
		System.out.println("老公帶老婆去購物");
		Thread t1 = new ShoppingTask(callback);
		t1.start();
		System.out.println("老公在椅子上休息等老婆");

	}

}
