package day10;

interface Bar {
	String NAME = "Bar"; // public static final
	void foo(); // public abstract
	
	//------------------------------------------------------------
	
	default void copyright() { // jdk 8
		System.out.println("copyright " + version());
	}
	
	static void print2() { // jdk 8 (不可以被複寫的類別方法)
		System.out.println("print...");
	}
	
	private int version() { // jdk 9, 主要是給 default 方法用的
		return 1;
	}
	
	private static void print() { // jdk 9, 主要是給 default 與 private 方法用的
		System.out.println("print...");
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
