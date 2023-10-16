package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		// Arrays.asList() 不可變集合
		List<String> list = Arrays.asList("a", "ab", "abc", "abcd", "abcde");
		//list.add("abcdef"); // 不可新增元素
		list.set(0, "A"); // 可以修改
		//list.remove(0); // 不可刪除元素
		System.out.println(list);
		
		// 將不可變集合轉成可變集合(new ArrayList<>())
		list = new ArrayList<>(list);
		
		// 移除長度 >= 3 的元素
		// 原本: [A, ab, abc, abcd, abcde]
		// 變為: [A, ab]
		list.removeIf(e -> e.length() >= 3);
		System.out.println(list);
		
		// 轉為靜態陣列 String[]
		String[] array = list.toArray(size -> new String[size]);
		System.out.println(Arrays.toString(array));
		
	}

}
