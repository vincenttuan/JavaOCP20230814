package day22;

public class TransactionMain {
	public static void main(String[] args) {
		TransactionCallback callback1 = (result, amount, price) -> {
			System.out.println(result);
			System.out.println("應付款的金額 $" + (amount * price));
		};
		
		ShoppingCallback callback2 = message -> {
			System.out.println("老婆說: " + message);
			System.out.println("老公去付錢");
		};
		
		System.out.println("開啟交易系統");
		
		// 執行交易 
		new TransactionTask(callback1).start();
		new ShoppingTask(callback2).start();
		
		System.out.println("等待交易結果與老婆");
		
	}
}
