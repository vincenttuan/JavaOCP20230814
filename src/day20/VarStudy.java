package day20;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class VarStudy {

	public static void main(String[] args) {
		var message = "Hello Java11";
		var number = 42;
		var pi = 3.14;
		pi = 3.1415;
		// pi = "play"; // 不可以轉其他型別
		
		System.out.println(message);
		System.out.println(number);
		System.out.println(pi);
		
		var list = List.of("apple", "banana", "orange");
		list.forEach((var data) -> System.out.println(data));
		
	}
	/*
	// 1. 不可以用在方法參數與返回類型
	public static var foo(var x, var y) {
		return x + y;
	}
	
	// 2. 不可以用在物件變數的型別定義上
	class Bar {
		String name;
		var age; // 不可以用在物件變數的型別定義上
	}
	 */
}
