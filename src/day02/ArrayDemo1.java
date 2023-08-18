package day02;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// 一維陣列
		int[] foo = new int[5]; // foo => [0, 0, 0, 0, 0]
		foo[0] = 90;            // foo => [90, 0, 0, 0, 0]
		foo[3] = 70;            // foo => [90, 0, 0, 70, 0]
		foo[4] = 50;            // foo => [90, 0, 0, 70, 50]
		System.out.println(foo.length); // 陣列長度 = 5
		System.out.print(foo[0] + ", ");
		System.out.print(foo[1] + ", ");
		System.out.print(foo[2] + ", ");
		System.out.print(foo[3] + ", ");
		System.out.println(foo[4]);
		

	}

}
