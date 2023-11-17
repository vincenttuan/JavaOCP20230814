package day24;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

// 買 5000 股 2330 要花多少美金 ?
public class FinancialAnalysis extends Thread {
	private CyclicBarrier cyclicBarrier;
	private String filePath;
	private static double stockPrice = 0;
	private static double exchangeRate = 0;
	
	public FinancialAnalysis(CyclicBarrier cyclicBarrier, String filePath, String threadName) {
		this.cyclicBarrier = cyclicBarrier;
		this.filePath = filePath;
		this.setName(threadName); // 設定執行緒名字
	}
	
	private void readData() throws Exception {
		List<String> lines = Files.readAllLines(Paths.get(filePath));
		for(String line : lines) {
			String[] data = line.split(",");
			
			switch (Thread.currentThread().getName()) {
				case "stockThread":
					// stock_market.txt
					if(data[1].equals("2330")) {
						stockPrice = Double.parseDouble(data[2]);
					}	
					break;
				case "exchangeThread":
					// exchange_market.txt
					if(data[1].equals("USD/TWD")) {
						exchangeRate = Double.parseDouble(data[2]);
					}	
					break;
			}
			
		}
	}
	
	@Override
	public void run() {
		try {
			// 讀取檔案資料
			readData();
			
			// 等其他執行緒完成讀取任務 
			cyclicBarrier.await();
			
			// 計算成本-可以交給特定執行緒執行
			if(Thread.currentThread().getName().equals("exchangeThread")) {
				System.out.println("stockPrice: " + stockPrice);
				System.out.println("exchangeRate: " + exchangeRate);
				double totalCostInTWD = stockPrice * 5000;
				double totalCostInUSD = totalCostInTWD / exchangeRate;
				System.out.printf("購買 5000 股 2330 股票需要 $%,.1f 美金%n", totalCostInUSD);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(2, () -> {
			System.out.println("數據讀取完成, 開始計算成本 ! thread name = " + Thread.currentThread().getName());
		});
		
		new FinancialAnalysis(cb, "src/day24/stock_market.txt", "stockThread").start(); // 讀股票報價檔
		new FinancialAnalysis(cb, "src/day24/exchange_market.txt", "exchangeThread").start(); // 讀匯率報價檔
		
	}
	
}
