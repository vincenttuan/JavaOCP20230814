package day20;

import java.util.Scanner;

public class TryWithRes {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println(10/0);
		}
		
		// 同等於
		
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println(10/0);
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		
	}

}
