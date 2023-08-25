package day04;

public class StringImmutable2 {

	public static void main(String[] args) {
		// 字串在Java中是不可變的（immutable），這意味著一旦它們被創建，我們不能更改它們的內容。
		String str = "Hello";
		// 想要透過一個方法來改變 str 所指向的字串內容
		str = append(str, "World");
		System.out.println(str);
	}
	
	public static String append(String original, String appendData) {
		String newString = original.concat(appendData); // original + appendData
		return newString;
	}
	
	

}
