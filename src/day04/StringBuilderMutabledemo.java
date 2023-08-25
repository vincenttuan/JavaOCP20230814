package day04;

// StringBuilder 是 mutable 可變更字串
// 若頻繁修改字串時會比 String (Immutable) 更高效
public class StringBuilderMutabledemo {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("World");
		System.out.println(sb);
		
	}
}
