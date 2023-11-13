package day23;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	// 提款
	public void withdraw(int amount) {
		String tName = Thread.currentThread().getName();
		
		// 目前帳戶餘額
		int currentBalance = this.balance;
		
		if(currentBalance >= amount) {
			System.out.printf("%s 提款 $%d (成功) 餘額 $%d%n", tName, amount, this.balance);
			// 餘額減去提款金額
			this.balance -= amount;
		} else {
			System.out.printf("%s 提款 $%d (失敗) 餘額 $%d%n", tName, amount, this.balance);
		}
		
	}
}
