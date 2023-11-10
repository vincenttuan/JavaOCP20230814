package day22;

public class TransactionMain {
	public static void main(String[] args) {
		TransactionCallback callback = (result, amount, price) -> {
			System.out.println(result);
			System.out.println("應付款的金額 $" + (amount * price));
		};
		
		System.out.println("開啟交易系統");
		
		// 執行交易 
		Thread t1 = new TransactionTask(callback);
		t1.start();
		
		System.out.println("等待交易結果");
		
	}
}
