package day05;

public class ArrayStream8 {
	public static void main(String[] args) {
		// 想要知道年資超過5年有誰且平均薪資為何?
		String[] names = {"Alice", "Bob", "Charlie", "David"}; // 姓名
		int[] yearOfExperience = {3, 8, 4, 6}; // 年資
		double[] salaries = {60000.0, 80000.0, 65000.0, 75000.0}; // 薪資
		
		// Java 8 以前
		for(int i=0;i<yearOfExperience.length;i++) {
			if(yearOfExperience[i] >= 5) {
				// 年資大於 5 的 index
				System.out.println(i);
				System.out.println(names[i]);
				System.out.println(salaries[i]);
			}
		}
		
		
	}
}
