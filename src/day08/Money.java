package day08;

public class Money {
	protected int value;
	
	public Money(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void display() {
		System.out.printf("價值 %d\n", value);
	}
}
