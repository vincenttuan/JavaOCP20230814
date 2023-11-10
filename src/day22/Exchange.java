package day22;

import java.util.Random;

// 取得匯率
public class Exchange extends Thread {
	private Callback callback;
	
	public Exchange(Callback callback) {
		this.callback = callback;
	}
	
	public void run() {
		// 目前匯率
		int ex = (new Random().nextInt(10)) + 10;
		System.out.println("目前匯率: " + ex);
		// 將匯率設定給 callback
		callback.result(ex);
	}
	
}
