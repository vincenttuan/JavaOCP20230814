package day23;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	private int balance;
	private final Lock lock = new ReentrantLock();
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	// 提款
	public synchronized void withdraw(int amount) {
		String tName = Thread.currentThread().getName();

		// 目前帳戶餘額
		int currentBalance = this.balance;

		if (currentBalance >= amount) {
			System.out.printf("%s 提款 $%d (成功) ", tName, amount);
			// 餘額減去提款金額
			this.balance -= amount;
			System.out.printf("餘額 $%d%n", this.balance);
		} else {
			System.out.printf("%s 提款 $%d (失敗) 餘額 $%d%n", tName, amount, this.balance);
		}

	}
	
	// 存款
	public void deposit(int amount) {
		String tName = Thread.currentThread().getName();
		lock.lock(); // 鎖定 this 物件
		try {
			this.balance += amount;
			System.out.printf("%s 存款 $%d (成功) 餘額 $%d%n", tName, amount, this.balance);
		} finally {
			lock.unlock(); // 釋放鎖 
		}
	}
	
}
