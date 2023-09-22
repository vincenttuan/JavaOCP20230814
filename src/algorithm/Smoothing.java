package algorithm;
/*
 * 指數平滑 
 * 指數平滑是一種時序預測的技術, 它基於對過去數據的加權平均進行預測
 * 適用場合: 當數據在短期有一定的規律性, 但長期趨勢不明確的情況, 就可以進行時間序列數據預測
 * 數學公式:
 * Ft+1 = αYt + (1 - α)Ft
 * Ft+1 是下一期的預測值
 * Yt   是當期的實際值
 * Ft   是當期的預測值
 * α    是平滑係數(通常在0~1之間)
 * 
 * 案例一: 
 * 小明在連續三天中，記錄了他在遊戲中得到的金幣數，分別是：5金、6金和5金。
 * 如果小明使用指數平滑法預測他下一天可能得到的金幣數，並且選擇的平滑係數 α 為 0.5，
 * 他在第四天可能會得到多少金幣？
 * 公式: Ft+1 = αYt + (1 - α)Ft
 * 5金、6金和5金 Y1 = 5, Y2 = 6, Y3 = 5
 * 平滑係數 α = 0.5
 * 
 * 第一天預測(初始預測)
 * F1 = Y1 = 5
 * 
 * 根據第一天的數據來預測第二天
 * t=1
 * F2 = αY1 + (1 - α)F1
 *    = 0.5*5 + (0.5)5
 *    = 2.5 + 2.5 = 5
 * 
 * 根據第二天的數據來預測第三天
 * t=2
 * F3 = αY2 + (1 - α)F2
 *    = 0.5*6 + (0.5)5
 *    = 5.5
 * 
 * 根據第三天的數據來預測第四天  
 * t=3
 * F4 = αY3 + (1 - α)F3
 *    = 0.5*5 + (0.5)5.5
 *    = 5.25
 * 
 * 根據平滑指數的預測, 小明在第四天可能會得到 5.25 個金幣
 * 
 * */

public class Smoothing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
