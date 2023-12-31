package day14;

import java.util.LinkedHashSet;
import java.util.Set;

public class BookSetDemo {
	
	public static void main(String[] args) {
		Book b1 = new Book("Java", 400);
		Book b2 = new Book("Python", 300);
		Book b3 = new Book("C#", 200);
		Book b4 = new Book("Web", 500);
		Book b5 = new Book("C/C++", 100);
		Book b6 = new Book("Java", 400); // 與 b1 內容相同
		
		Set<Book> books = new LinkedHashSet<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);
		
		System.out.println(books.size());
		books.forEach(System.out::println);
		
		Book targetBook = new Book("C#", 200);
		// 請問 books 集合中有沒有 targetBook 這一本書 ?
		System.out.println(books.contains(targetBook));
		System.out.println(b3.hashCode());
		System.out.println(targetBook.hashCode());
		
		
	}
	
}
