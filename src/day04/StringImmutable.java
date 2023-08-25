package day04;

public class StringImmutable {

	public static void main(String[] args) {
		// 字串在Java中是不可變的（immutable），這意味著一旦它們被創建，我們不能更改它們的內容。
		String str = "Hello";
		str = str.replace('H', 'h'); // hello
		System.out.println(str);
		str = str.concat(" Java"); // hello Java
		System.out.println(str);
	}

}
