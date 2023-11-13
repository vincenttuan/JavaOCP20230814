package day23;

public class BankDemo {

	public static void main(String[] args) {
		// 帳戶資源
		BankAccount bankAccount = new BankAccount(10000);
		
		// 提款工作
		Runnable task1 = new Withdraw(bankAccount, 5000);
		Runnable task2 = new Withdraw(bankAccount, 4000);
		Runnable task3 = new Withdraw(bankAccount, 2000);
		
		// 建立 3 條執行緒取執行提款工作
		Thread t1 = new Thread(task1, "小明");
		Thread t2 = new Thread(task2, "小華");
		Thread t3 = new Thread(task3, "小英");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
