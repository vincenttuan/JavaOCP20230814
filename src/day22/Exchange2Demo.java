package day22;

import java.util.function.Consumer;

public class Exchange2Demo {

	public static void main(String[] args) {
		int x = 100;
		
		Consumer<Integer> callback = (ex) -> System.out.println("x = " + (x * ex));
		
		
	}

}
