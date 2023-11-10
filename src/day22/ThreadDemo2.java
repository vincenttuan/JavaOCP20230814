package day22;

import java.util.Arrays;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Runnable[] runnables = {
				new Program(), new Art(), new Performer(),
				new Program(), new Art(), new Performer(),
				new Program(), new Art(), new Performer(),
		};
		
		Arrays.stream(runnables).forEach(r -> new Thread(r).start());
		
	}

}
