package day04;

import java.util.Random;

public class IdAutoGenerator {
	
	public static void main(String[] args) {
		String id = getId();
		System.out.println(id);
	}
	
	public static String getId() {
		Random random = new Random();
		int e1 = 1; // A
		char[] chars = null;
		while (true) {
			chars = new char[9];
			for(int i=0;i<chars.length;i++) {
				if(i==0) {
					chars[i] = (char) (random.nextInt(2) + 48 + 1);
				} else {
					chars[i] = (char) (random.nextInt(10) + 48);
				}
			}
			int[] dx = {8, 7, 6, 5, 4, 3, 2, 1, 1};
			
			int sum = e1;
			for(int i=0;i<chars.length;i++) {
				sum += (chars[i]-48) * dx[i];
			}
			if(sum % 10 == 0) {
				break;
			}
		}
		
		return "A" + new String(chars);
	}	

}
