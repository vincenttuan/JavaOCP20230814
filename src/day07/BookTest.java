package day07;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		b1.name="Java";
		b1.price = 100;
		b2.price = 200;
		System.out.println(b1.price);
		System.out.println(b2.price);
		System.out.println(b1.name);
		System.out.println(b2.name);
		System.out.println(b1.count); // 不建議
		System.out.println(b2.count); // 不建議
		System.out.println(Book.count);
	}
}
