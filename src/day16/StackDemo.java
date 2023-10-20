package day16;

import java.util.Scanner;
import java.util.Stack;

// 堆疊(棧): 特殊的 List
public class StackDemo {

	public static void main(String[] args) {
		Stack<String> historyStack = new Stack<>();
		
		// 假設用戶訪問了幾個網頁
		historyStack.push("www.google.com");
		historyStack.push("yahoo.com.tw");
		historyStack.push("www.oracle.com");
		historyStack.push("www.yam.com");
		
		System.out.println("用戶訪問歷史紀錄: " + historyStack);
		
		// 模擬用戶按下 back 鍵
		while (!historyStack.isEmpty()) {
			System.out.print("按下 enter 鍵(Back):");
			new Scanner(System.in).nextLine();
			String webSite = historyStack.pop();
			System.out.println("目前網頁: " + webSite);
		}
		
		System.out.println("用戶訪問歷史紀錄: " + historyStack);
		System.out.println("沒有歷史紀錄了");

	}

}
