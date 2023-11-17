package day24;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class FinancialDataCollector extends Thread {
	
	private CyclicBarrier cyclicBarrier;
	private String name;
	
	public FinancialDataCollector(CyclicBarrier cyclicBarrier, String name) {
		this.cyclicBarrier = cyclicBarrier;
		this.name = name;
	}
	
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 開始蒐集 %s 數據...%n", tName, name);
		try {
			// 模擬收集數據的時間
			Thread.sleep(new Random().nextInt(5000));
			System.out.printf("%s 完成 %s 數據的收集%n", tName, name);
			// 等待其他執行緒
			cyclicBarrier.await();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.printf("%s 開始進行相關數據分析%n", tName);
		// 模擬數據分析的過程 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
