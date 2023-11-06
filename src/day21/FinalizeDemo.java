package day21;

class Foo {
	int value1 = Integer.MAX_VALUE;
	int value2 = Integer.MIN_VALUE;
	
	// 建構子 constructor
	Foo() {
		String tName = Thread.currentThread().getName();
		System.out.println("Foo 建構子, 執行者:" + tName);
	}
	
	// finalize
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		String tName = Thread.currentThread().getName();
		System.out.println("Foo finalize, 執行者:" + tName);
	}
	
}

public class FinalizeDemo {

	public static void main(String[] args) {
		System.out.println("begin");
		Foo f1 = new Foo();
		System.out.println(f1.value1);
		System.out.println(f1.value2);
		f1 = null;
		System.gc();
		System.out.println("end");
	}

}
