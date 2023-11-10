package day22;

import java.util.Date;

public class TransactionTask extends Thread {
	private TransactionCallback callback;
	
	public TransactionTask(TransactionCallback callback) {
		this.callback = callback;
	}

	@Override
	public void run() {
		
		try {
			System.out.println("交易開始");
			Thread.sleep(2000);
			System.out.println("交易結束");
			if(new Date().getTime() % 2 == 0) {
				callback.onTransactionCompleted("交易成功", 10, 500);
			} else {
				throw new Exception("交易失敗");
			}
		} catch (Exception e) {
			callback.onTransactionCompleted(e.getMessage(), 0, 0);
		}
		
	}
	
}
