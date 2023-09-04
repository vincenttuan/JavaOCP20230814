package day07;

public class Book {
	static int count;
	String name;
	int price;
	
	Book() {
		count++;
	}
	
	void foo() { // 物件方法
		System.out.println(name);
		System.out.println(price);
		System.out.println(count);
	}
	
	static void bar() { // 類別方法
		//System.out.println(name); // 不可直接使用物件變數
		//System.out.println(price); // 不可直接使用物件變數
		System.out.println(count);
	}
	
	static void bar2() {
		Book book = new Book();
		System.out.println(book.name);
		System.out.println(book.price);
	}
}
