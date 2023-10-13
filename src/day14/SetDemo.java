package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// 預設容器元素可以放任意 Object
		//Set set = new HashSet();
		Set set1 = new LinkedHashSet();
		set1.add("國");
		set1.add("英");
		set1.add("?");
		set1.add("數");
		
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		System.out.println(set1.size());
		System.out.println(set1.contains("英"));
		System.out.println(set1.contains("社"));
		// 走訪每一個元素
		set1.forEach(e -> System.out.println(e));
		
		// 走訪每一個元素利用走訪器 Iterator
		// Iterator 可以移除元素
		Iterator iter = set1.iterator();
		while (iter.hasNext()) { // 是否還有元素
			String e = (String) iter.next(); // 得到元素並轉字串
			System.out.println(e); // 印出元素
			if(e.equals("?")) {
				System.out.println("移除 ?");
				iter.remove(); // 移除元素
			}
		}
		
		System.out.println(set1);
		
		// Java 8 之後每一種容器都有內建 stream 可以進行容器元素的分析 
		set1.stream()
			.forEach(System.out::println);
	}

}
