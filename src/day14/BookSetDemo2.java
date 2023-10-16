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
		
		// price 由小到大
		books.forEach(System.out::println);
		System.out.println("最貴的書: " + books.last());
		System.out.println("最便宜的書: " + books.first());
		// 金額 price >= b2 的書
		//books.tailSet(b2).forEach(System.out::println);
		// 金額 price >= 350 的書
		books.tailSet(new Book("", 350))
			 .forEach(System.out::println);
		
		// price 由大到小
		System.out.println();
		books.descendingSet().forEach(System.out::println);
		
	}
	
}
