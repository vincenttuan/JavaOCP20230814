package day08;

class Father {
	int x = 100;
	void display() {
		System.out.println("Father " + x);
	}
}

class Son extends Father {
	int x = 200;
	void display() {
		System.out.println("Son " + x);
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Father father = new Father();
		System.out.println(father.x); // 100
		father.display(); // Father 100
		
		Son son = new Son(); 
		System.out.println(son.x); // 200
		son.display(); // Son 200
		
		
	}

}
