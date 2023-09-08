package day08;

class Father {
	int x = 100;
	void display() {
		System.out.println("Father " + x);
	}
	public int getX() {
		return x;
	}
}

class Son extends Father {
	int x = 200;
	void display() {
		System.out.println("Son " + x);
	}
	public int getX() {
		return x;
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
		// 屬性遮蔽與方法覆寫的差異
		
		Father fs = new Son(); // 多型宣告
		System.out.println(fs.x); // 100
		System.out.println(fs.getX()); // 200
		// 方法的行為是基於物件類型(new Son()), 變數的行為是基於宣告的類型(Father)
		fs.display(); // Son 200
		
	}

}
