package day12;

// 外部類別-資產負債表
public class BalanceSheet {
	
	// 內部類別-資產
	class Assets {
		private double currentAssets; // 流動資產
		private double nonCurrentAssets; // 非流動資產
		
		public Assets(double currentAssets, double nonCurrentAssets) {
			this.currentAssets = currentAssets;
			this.nonCurrentAssets = nonCurrentAssets;
		}
		
		public double getTotalAssets() {
			return currentAssets + nonCurrentAssets;
		}
	}
	
	// 內部類別-負債與股東權益
	class LiabilitiesAndEquity {
		private double currentLialailablties; // 流動負債
		private double nonCurrentLialailablties; // 非流動負債
		private double equity; // 股東權益
		
		public LiabilitiesAndEquity(double currentLialailablties, double nonCurrentLialailablties, double equity) {
			this.currentLialailablties = currentLialailablties;
			this.nonCurrentLialailablties = nonCurrentLialailablties;
			this.equity = equity;
		}
		
		public double getTotalLiabilitiesAndEquity() {
			return currentLialailablties + nonCurrentLialailablties + equity;
		}
		
	}
	
	private Assets assets; // 資產
	private LiabilitiesAndEquity liabilitiesAndEquity; // 負債與股東權益
	
	public BalanceSheet(double currentAssets, double nonCurrentAssets,
			double currentLialailablties, double nonCurrentLialailablties, double equity) {
		// 建立資產資料
		this.assets = new Assets(currentAssets, nonCurrentAssets);
		// 建立負債與股東權益資料
		this.liabilitiesAndEquity = new LiabilitiesAndEquity(currentLialailablties, nonCurrentLialailablties, equity);
	}
	
	// 判斷資產是否高過負債
	private boolean isAssestThanLiabilities() {
		return assets.getTotalAssets() > liabilitiesAndEquity.getTotalLiabilitiesAndEquity();
	}
	
	// 印出資產負債表
	public void display() {
		System.out.println("資產負債表");
		System.out.println("--------------------------------------");
		System.out.printf("總資產: $%,.0f\n", assets.getTotalAssets());
		System.out.printf("總負債與股東權益: $%,.0f\n", liabilitiesAndEquity.getTotalLiabilitiesAndEquity());
		if(isAssestThanLiabilities()) {
			System.out.println("資產高過負債");
		} else {
			System.out.println("負債高過資產或相等");
		}
	}
	
	// 測試
	public static void main(String[] args) {
		BalanceSheet balanceSheet = new BalanceSheet(10000, 50000, 40000, 10000, 15000);
		balanceSheet.display();
	}
	
}
















