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
