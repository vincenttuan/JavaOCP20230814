package day14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// 預設容器元素可以放任意 Object
		//Set set = new HashSet();
		Set set = new LinkedHashSet();
		set.add("國");
		set.add("英");
		set.add("數");
		System.out.println(set);
		
		
		
	}

}
