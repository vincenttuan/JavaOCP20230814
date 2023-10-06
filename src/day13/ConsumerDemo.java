package day13;

import java.util.function.Consumer;

/**
 API:
 @FunctionalInterface 
 public interface Consumer<T> { 
 	void accept(T t); 
 } 
 Consumer 接收一個任意型別<T>的參數, 無回傳值
 */

public class ConsumerDemo {

	public static void main(String[] args) {
		// 你進入一個餐廳訂了一份牛排, 服務生(Consumer) 會接收你的點單(參數)
		// 但是服務生(Consumer)不會給你任何東西, 他僅僅執行點餐的動作
		// 服務生(Consumer)
		Consumer<String> waiter = t -> System.out.println("您點了" + t);
		// 叫服務生來點餐
		waiter.accept("牛排");
		waiter.accept("排骨麵");
		
		// 你可以將書籍放入到數櫃中, 書櫃(Consumer) 接收書籍(參數), 但是書櫃不會回傳任何東西給你
		// 書櫃(Consumer)
		Consumer<String> bookshelf = book -> System.out.println("放入" + book + "到書櫃");
		// 走到書櫃前面放書
		bookshelf.accept("哈利波特");
		
		// 將某個數字印出來
		Consumer<Integer> print = num -> System.out.println(num);
		print.accept(10);
		
	}

}
