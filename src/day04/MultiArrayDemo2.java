package day04;

public class MultiArrayDemo2 {
	
	public static void main(String[] args) {
		// 利用二維陣列模擬電影院座位表
		int[][] seats = {
						 {1, 0, 0, 0, 1},
						 {0, 1, 0, 1, 0},
						 {0, 0, 1, 0, 0},
					   };
		displaySeatStatus(seats, 0, 0);
		displaySeatStatus(seats, 1, 3);
		displaySeatStatus(seats, 2, 2);
		displayAllSeats(seats);
		
		boolean bookResult = bookSeat(seats, 0, 1); // 訂位
		System.out.println(bookResult);
		displayAllSeats(seats);
		
		boolean cancelResult = cancelSeat(seats, 0, 1); // 取消訂位
		System.out.println(cancelResult);
		displayAllSeats(seats);
		
		boolean autoBookResult = bookSeat(seats); // 電腦選位
		System.out.println(autoBookResult);
		displayAllSeats(seats);
	}
	
	// 訂位-電腦選位
	public static boolean bookSeat(int[][] seats) {
		for(int row=0;row<seats.length;row++) {
			for(int col=0;col<seats[row].length;col++) {
				if(seats[row][col] == 0) {
					seats[row][col] = 1;
					System.out.printf("電腦已經幫您選擇第%d排第%d個位置\n", row+1, col+1);
					return true;
				}
			}
		}
		System.out.println("很抱歉, 所有位置都已經被預訂了");
		return false;
	}
	
	// 取消訂位 cancelSeat
	public static boolean cancelSeat(int[][] seats, int row, int col) {
		// 檢查指定位置是否是 1
		if(seats[row][col] == 1) {
			seats[row][col] = 0;
			System.out.println("取消訂位成功!");
			return true;
		} else {
			System.out.println("很抱歉, 該座位並未被預訂, 無法取消!");
			return false;
		}
	}
	
	// 訂位-人工選位
	public static boolean bookSeat(int[][] seats, int row, int col) {
		// 檢查指定位置是否是 0
		if(seats[row][col] == 0) {
			seats[row][col] = 1;
			System.out.println("訂位成功!");
			return true;
		} else {
			System.out.println("很抱歉, 該座位已被預訂!");
			return false;
		}
	}
	
	// 指定座位狀態
	public static void displaySeatStatus(int[][] seats, int row, int col) {
		System.out.printf("第%d排第%d個位置 seat[%d][%d] = %d\n", row+1, col+1, row, col, seats[row][col]);
	}
	
	// 顯示所有座位資訊 空位[ ] 有人[X]
	public static void displayAllSeats(int[][] seats) {
		for(int[] row : seats) {
			for(int seat : row) {
				if(seat == 0) {
					System.out.print("[ ]");
				} else {
					System.out.print("[X]");
				}
			}
			System.out.println();
		}
	}
	
}
