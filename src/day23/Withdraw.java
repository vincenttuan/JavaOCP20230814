package day23;

// 提款執行緒工作
public class Withdraw implements Runnable {
	private BankAccount bankAccount; // 帳戶資源
	private int amount; // 提款金額
	
	public Withdraw(BankAccount bankAccount, int amount) {
		this.bankAccount = bankAccount;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		// 提款工作
		bankAccount.withdraw(amount);
	}

}
