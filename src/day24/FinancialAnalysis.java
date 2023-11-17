package day24;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

// 買 5000 股 2330 要花多少美金 ?
public class FinancialAnalysis extends Thread {
	private CyclicBarrier cyclicBarrier;
	private String filePath;
	private double stockPrice = 0;
	private double exchangeRate = 0;
	
	public FinancialAnalysis(CyclicBarrier cyclicBarrier, String filePath) {
		this.cyclicBarrier = cyclicBarrier;
		this.filePath = filePath;
	}
	
	private void readData() throws Exception {
		List<String> lines = Files.readAllLines(Paths.get(filePath));
		for(String line : lines) {
			String[] data = line.split(",");
			
			// stock_market.txt
			if(data[1].equals("2330")) {
				stockPrice = Double.parseDouble(data[2]);
			}
			
			// exchange_market.txt
			if(data[1].equals("USD/TWD")) {
				exchangeRate = Double.parseDouble(data[2]);
			}
			
		}
	}
	
	@Override
	public void run() {
		
	}
}
