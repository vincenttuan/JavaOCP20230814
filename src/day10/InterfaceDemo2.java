package day10;

interface A {
	void foo();
	default void bar() {
		System.out.println("Bar A");
	}
}

interface B {
	void foo();
}

class C implements A, B {
	@Override
	public void foo() {
		System.out.println("Foo");
	}
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
		C c = new C();
		c.foo();
		c.bar();
		
	}
}
