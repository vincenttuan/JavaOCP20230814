package day22;

public class Person extends Thread {
	
	@Override
	public void run() {
		job();
	}

	private void job() {
		// 執行緒名稱
		String tName = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
			System.out.printf("%s: 撰寫程式-%d %n", tName, i);
		}
	}
	
}
