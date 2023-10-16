package day15;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList: 連續的動態數組,希望能創造O(1)的隨機訪問, 但是需要調整大小結構, 刪 (慢)
 * LinkedList: 元素與元素之間都有參考點, 透過參考形成連續的數組, 隨機訪問比 ArrayList 慢, 但是刪 (快)
 * LinkedList 中的 Queue 佇列屬於特殊集合, 效率會比 ArrayList 快
 * */
public class ListDemo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // LinkedList<>()
		list.add("Java");
		list.add("C#");
		list.add(0, "Python"); // 指定要放的 index
		list.add("C/C++");
		list.add(1, "VB");
		System.out.println(list);
		System.out.println(list.get(1));
		// 變更 index = 2 的元素內容為 "Java11"
		list.set(2, "Java11");
		System.out.println(list);
		// 移除 index = 3 或內容為"C#" 的元素
		list.remove(3); //list.remove("C#");
		System.out.println(list);
		// list 中是否包含 "Java11" 的元素
		System.out.println(list.contains("Java11"));
		
	}

}
