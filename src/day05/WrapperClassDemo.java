package day05;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// Wrapper class 的應用
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		String chinese = "100";
		String english = "80";
		System.out.println(chinese + english);
		System.out.println(Integer.parseInt(chinese) + Integer.parseInt(english));
		int x = 90;
		int y = 50;
		int maxValue = Integer.max(x, y);
		System.out.println(maxValue);
		int a = 12345;
		int b = Integer.reverse(a);
		System.out.println(b);
		int c = -1676935168;
		int d = Integer.reverse(c);
		System.out.println(d);
	}

}
