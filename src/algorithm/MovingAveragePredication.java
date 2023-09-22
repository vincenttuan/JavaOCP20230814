package algorithm;
/*
 * 移動平均法
 * 移動平均法的基本概念是計算近期的平均數據,並用此來預測下一期的數據
 * 例如:透過最後三個數字的平均值來預測下一個數字
 * */
public class MovingAveragePredication {

	public static void main(String[] args) {
		int[] values = {10, 20, 15, 12, 18, 15}; // ?
		//               1   2   3   4   5   6      7 天
		// 請透過3日移動平均法來預測第 7 天的數字
		int len = values.length;
		double predication = (values[len-1] + values[len-2] + values[len-3]) / 3.0;
		System.out.println(predication);
	}

}
