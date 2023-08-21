package day03;

public class StringDemo {

	public static void main(String[] args) {
		String word = "she sell sea shell on the sea shore";
		System.out.println(word);
		// 字串長度
		System.out.printf("字串長度: %d\n", word.length());
		// 是否包含 "sea" ?
		boolean containSea = word.contains("sea");
		System.out.printf("是否包含 \"sea\": %b\n", containSea);
		// 利用 indexOf(keyword) 得到 keyword 的位置
		int seaIndex = word.indexOf("sea");
		if(seaIndex == -1) {
			System.out.println("沒有包含 \"sea\"");
		} else {
			System.out.printf("有包含 \"sea\" 且在位置: %d\n", seaIndex);
		}
		// 利用 charAt(index) 得到 index 所對應的字元
		System.out.printf("charAt(1) 得到 %c\n", word.charAt(1));
		// word 字串中有幾個 "s"
		// 利用 for-loop
		int count = 0;
		for(int i=0;i<word.length();i++) {
			// 逐字比對
			if(word.charAt(i) == 's') {
				count++;
			}
		}
		System.out.printf("word 字串中有幾個 \"s\": %d\n", count);
		// 利用 Java Stream
		long count2 = word.chars().filter(ch -> ch == 's').count();
		System.out.printf("word 字串中有幾個 \"s\": %d\n", count2);
		
	}

}








