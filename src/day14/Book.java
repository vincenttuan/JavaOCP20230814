package day14;

import java.util.Objects;

/*
 * 1.若要將 Book 物件放到 Set 集合中
 * 必須實作 equals() 與 hashCode() 方法
 * 2.若要將 Book 物件放到 TreeSet 集合中
 * 就必須要 implement Comparable
 * */
public class Book implements Comparable<Book> {
	private String name; // 書名
	private Integer price; // 價格
	
	public Book(String name, Integer price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book otherBook) {
		// 利用 price 來比較大小順序
		//return this.price - otherBook.price;
		// 利用 name 字串來比較大小順序
		return this.name.compareTo(otherBook.name);
	}
	
	
}
