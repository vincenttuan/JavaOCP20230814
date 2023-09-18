package day10;

interface A {
	void foo();
	default void bar() {
		System.out.println("Bar A");
	}
}

interface B {
	void foo();
	default void bar() {
		System.out.println("Bar B");
	}
}

class C implements A, B {
	@Override
	public void foo() {
		System.out.println("Foo");
	}

	@Override
	public void bar() {
		A.super.bar();
		B.super.bar();
	}
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
		C c = new C();
		c.foo();
		c.bar();
		
	}
}
