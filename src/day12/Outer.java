package day12;

public class Outer {
	int x = 7;
	static int s = 9;
	class Inner {
		int x = 77;
		//static int s = 9; // 一般內部類別不可以有 static 成員
		void print() {
			int x = 777;
			System.out.println(x); // 777
			System.out.println(this.x); // 77
			System.out.println(Outer.this.x); // 7
			System.out.println(Outer.s); // 9
		}
	}
	
	// 測試
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.print();
	}
}
