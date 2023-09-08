package day08;

public class Coin extends Money {
	private String label;
	
	public Coin(int value, String label) {
		super(value); // 呼叫 Money 的建構子
		this.label = label;
	}
	
	public void display() {
		System.out.printf("%s硬幣價值 $%d 可換 %d 個\n", label, value, count);
	}
	
}
