package day24;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
	private CyclicBarrier cyclicBarrier;
	
	public Car(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 從台北出發%n", tName);
		try {
			// 模擬執行時間
			Thread.sleep(new Random().nextInt(5000));
			System.out.printf("%s 到台中了%n", tName);
			// 等其他執行緒
			cyclicBarrier.await();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.printf("%s 工作結束%n", tName);
	}
	
	
}
