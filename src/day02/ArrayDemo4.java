package day02;

/*
 * 調查五位學生之身高及體重如下:
 * 身高：172、168、164、170、176(公分)
 * 體重：62、57、58、64、64(公斤)
 * 求身高,體重分散程度哪一個大
 * */
public class ArrayDemo4 {

	public static void main(String[] args) {
		double[] heights = {172, 168, 164, 170, 176};
		double[] weights = {62, 57, 58, 64, 64};
		
		double heightAvg = getAverage(heights);
		System.out.printf("身高的平均: %.1f\n", heightAvg);
		double weightAvg = getAverage(weights);
		System.out.printf("體重的平均: %.1f\n", weightAvg);
		
		double heightSD = getSD(heights, heightAvg);
		System.out.printf("身高的標準差: %.3f\n", heightSD);
		double weightSD = getSD(weights, weightAvg);
		System.out.printf("體重的標準差: %.3f\n", weightSD);
		
		double heightCV = getCV(heightSD, heightAvg);
		System.out.printf("身高的變異係數: %.3f\n", heightCV);
		double weightCV = getCV(weightSD, weightAvg);
		System.out.printf("體重的變異係數: %.3f\n", weightCV);
		
		if(heightCV > weightCV) {
			System.out.println("身高分散較大");
		} else {
			System.out.println("體重分散較大");
		}
	}
	
	// 計算變異係數 CV
	public static double getCV(double sd, double avg) {
		double cv = sd / avg;
		return cv;
	}
	
	// 計算標準差 SD
	public static double getSD(double[] values, double avg) {
		int n = values.length;
		double sd = 0;
		double powerSum = 0; // 平方和
		for(double x : values) {
			powerSum += Math.pow(x - avg, 2);
		}
		sd = Math.sqrt(powerSum / n);
		return sd;
	}
	
	// 建立一個可以計算平均的方法
	// 方法參數: values 是一個一維的 double[] 陣列
	// 方法回傳值: double, 指的就是計算平均的結果
	public static double getAverage(double[] values) {
		double sum = 0;
		for(double x : values) {
			sum += x;
		}
		double avg = sum / values.length;
		return avg;
	}
	
	

}
