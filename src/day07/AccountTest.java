package day07;

public class AccountTest {

	public static void main(String[] args) {
		Account act1 = new Account("John", 10000);
		Account act2 = new Account("Mary", 10000);
		act1.printBalance();
		act2.printBalance();
		act1.deposit(6000); // 存款 6000
		act1.printBalance();
		act2.withdraw(15000); // 提款 15000
		act2.printBalance();
		act2.withdraw(8000); // 提款 8000
		act2.printBalance();
		// act1 轉 10000 給 act2
		act1.transfer(10000, act2);
		act1.printBalance();
		act2.printBalance();
	}

}
