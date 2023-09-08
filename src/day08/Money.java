package day08;

public class Money {
	protected int value;
	protected int count;
	
	public Money(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	// 可以換幾個(張)
	public int computeCount(int change) {
		count = change / value;
		return count;
	}
	
	public void display() {
		System.out.printf("價值 %d\n", value);
	}
}
