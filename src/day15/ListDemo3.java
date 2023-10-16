package day15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
可變集合/不可變集合/不可修改集合

           +-----+-----+--------+
           | add | set | remove |
+----------+-----+-----+--------+
| 可以變的集合 |  V  |  V  |   V    | new ArrayList(), new LinkedList()...
+----------+-----+-----+--------+
| 不可變的集合 |  X  |  V  |   X    | Arrays.asList(...)
+----------+-----+-----+--------+
| 不可修改集合 |  X  |  X  |   X    | Collections.unmodifiableList(...), List.of(...) ...
+----------+-----+-----+--------+
 
*/
public class ListDemo3 {

	public static void main(String[] args) {
		// 不可修改集合
		//List<Integer> list = List.of(100, 90, 80); // since Java 9
		List<Integer> list = Collections.unmodifiableList(Arrays.asList(100, 90, 80));
		//list.add(70); // 錯誤
		//list.set(0, 99); // 錯誤
		//list.remove(0); // 錯誤
		System.out.println(list);
		
	}

}
