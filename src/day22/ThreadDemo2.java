package day22;

import java.util.Arrays;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Runnable[] runnables = {
				new Program(), new Art(), new Performer(),
				new Program(), new Art(), new Performer(),
				new Program(), new Art(), new Performer(),
		};
		
		// Java 7
		for(int i=0;i<runnables.length;i++) {
			Thread t = new Thread(runnables[i]);
			t.start();
		}
		
		// Java 8
		Arrays.stream(runnables).forEach(r -> new Thread(r).start());
		
	}

}
