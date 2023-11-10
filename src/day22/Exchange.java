package day22;

import java.util.Random;

// 取得匯率
public class Exchange extends Thread {
	
	public void run() {
		// 目前匯率
		int ex = (new Random().nextInt(10)) + 10;
		System.out.println("目前匯率: " + ex);
	}
	
}
