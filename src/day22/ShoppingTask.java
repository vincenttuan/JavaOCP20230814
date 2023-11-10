package day22;

import java.util.Random;

public class ShoppingTask extends Thread {
	private ShoppingCallback callback;
	
	public ShoppingTask(ShoppingCallback callback) {
		this.callback = callback;
	}

	@Override
	public void run() {
		// 模擬購物流程
		try {
			System.out.println("購物開始");
			// 模擬購物的耗時 
			Thread.sleep(2000);
			System.out.printf("買了 %d 個商品%n", new Random().nextInt(10));
			System.out.println("購物結束");
			// 購物完成之後要回調通知
			callback.onShoppingCompleted("我買完了, 可以回家了");
		} catch (Exception e) {
			callback.onShoppingCompleted("發生錯誤: " + e);
		}
	}
	
}
