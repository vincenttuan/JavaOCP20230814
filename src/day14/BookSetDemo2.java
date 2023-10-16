package day14;

import java.util.Set;
import java.util.TreeSet;

public class BookSetDemo2 {
	
	public static void main(String[] args) {
		Book b1 = new Book("Java", 400);
		Book b2 = new Book("Python", 300);
		Book b3 = new Book("C#", 200);
		Book b4 = new Book("Web", 500);
		Book b5 = new Book("C/C++", 100);
		
		TreeSet<Book> books = new TreeSet<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		
		System.out.println(books.size());
		books.forEach(System.out::println);
		System.out.println();
		books.descendingSet().forEach(System.out::println);
		
	}
	
}
