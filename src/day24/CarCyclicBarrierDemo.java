package day24;

import java.util.concurrent.CyclicBarrier;

public class CarCyclicBarrierDemo {

	public static void main(String[] args) {
		int n = 4;
		CyclicBarrier cyclicBarrier = new CyclicBarrier(n, () -> {
			System.out.println("中午吃飯");
		});
		
		for(int i=0;i<n;i++) {
			new Car(cyclicBarrier).start();
		}
	}

}
