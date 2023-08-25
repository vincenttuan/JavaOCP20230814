package day04;

public class StringAndArray {

	public static void main(String[] args) {
		String id = "A123456789";
		int e1 = 1; // A
		
		char[] chars = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int[] dx     = {8, 7, 6, 5, 4, 3, 2, 1, 1};
		
		//System.out.println(chars[0]-48);
		int sum = e1;
		for(int i=0;i<chars.length;i++) {
			sum += (chars[i]-48) * dx[i];
		}
		System.out.println(sum);
		System.out.println(sum % 10 == 0);
		

	}

}
