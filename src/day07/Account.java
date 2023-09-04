package day07;

public class Account {
	
	private String name; // 帳戶名稱
	private int balance; // 預設值 = 0
	
	public Account(String name, int initBalance) {
		this.name = name;
		this.balance = initBalance;
	}
	
	public void deposit(int amount) { // 存款
		if(amount > 0) {
			this.balance += amount;
			System.out.printf("帳戶: %s 存款: %,d 成功\n", name, amount);
		} else {
			System.out.printf("帳戶: %s 存款: %,d 失敗\n", name, amount);
		}
	}
	
	public void withdraw(int amount) { // 提款
		if(amount > 0 && amount <= this.balance) {
			this.balance -= amount;
			System.out.printf("帳戶: %s 提款: %,d 成功\n", name, amount);
		} else {
			System.out.printf("帳戶: %s 提款: %,d 失敗 ", name, amount);
			System.out.printf("餘額不足 ! 餘額: %,d\n", this.balance);
		}
	}
	
	public void transfer(int amount, Account acct) { // 轉帳
		if(amount > 0 && amount <= this.balance) {
			this.balance -= amount; // 自己要扣掉轉帳金額
			acct.deposit(amount); // 對轉帳物件調用存款方法
			System.out.printf("帳戶: %s 轉帳: %,d 成功\n", name, amount);
		} else {
			System.out.printf("帳戶: %s 轉帳: %,d 失敗 ", name, amount);
			System.out.printf("餘額不足 ! 餘額: %,d\n", this.balance);
		}
	}
	
	public void printBalance() {
		System.out.printf("帳戶: %s 餘額: %,d\n", name, balance);
	}
	
}
