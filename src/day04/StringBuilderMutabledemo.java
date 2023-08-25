package day04;

// StringBuilder 是 mutable 可變更字串
// 若頻繁修改字串時會比 String (Immutable) 更高效
public class StringBuilderMutabledemo {
	
	public static void main(String[] args) {
		// StringBuilder (Java 5.0 才有的, 使用情境單工作業模式)
		// StringBuffer (使用情境多執行緒)
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("World");
		System.out.println(sb);
		
	}
}
