package day22;

import java.util.function.Consumer;

public class Exchange2Demo {

	public static void main(String[] args) {
		int x = 100;
		
		Consumer<Integer> callback1 = (ex) -> System.out.println("x = " + (x * ex));
		Consumer<Integer> callback2 = (ex) -> System.out.println("x = " + (x / ex));
		Consumer<Integer> callback3 = (ex) -> System.out.println("x = " + (x + ex));
		Consumer<Integer> callback4 = (ex) -> System.out.println("x = " + (x - ex));
		
		Thread t1 = new Exchange2(callback3);
		t1.start();
		
	}

}
