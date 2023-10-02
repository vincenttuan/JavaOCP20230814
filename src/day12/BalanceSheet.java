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
	
}
