package day08;

public class Note extends Money {
	private String label;
	
	public Note(int value, String label) {
		super(value); // 呼叫 Money 的建構子
		this.label = label;
	}
	
	public void display() {
		System.out.printf("%s紙鈔價值 $%d\n", label, value);
	}
	
}
