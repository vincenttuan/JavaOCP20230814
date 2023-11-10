package day22;

public class ThreadDemo {

	public static void main(String[] args) {
		Runnable r1 = new Program();
		Runnable r2 = new Art();
		Runnable r3 = new Performer();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		// 印出的順序不一定會按照既定的順序
		t1.start();
		t2.start();
		t3.start();
	}

}
