package day22;

import java.util.Random;
import java.util.function.Consumer;

public class Exchange2 extends Thread {
	Consumer<Integer> callback;
	
	public Exchange2(Consumer<Integer> callback) {
		this.callback = callback;
	}
	
	@Override
	public void run() {
		int ex = (new Random().nextInt(10)) + 10;
		callback.accept(ex);
	}
	
}
