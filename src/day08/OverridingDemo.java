package day08;

class Father {
	int x = 100;
	void display() {
		System.out.println("Father");
	}
}

class Son extends Father {
	int x = 200;
	void display() {
		System.out.println("Son");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Father father = new Father();
		System.out.println(father.x);
		father.display();
		
		Son son = new Son();
		System.out.println(son.x);
		son.display();
		

	}

}
