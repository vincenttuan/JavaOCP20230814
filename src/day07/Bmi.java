package day07;

public class Bmi {
	private double h;
	private double w;
	
	public double getH() {
		return h;
	}
	
	double getBmi() {
		return BmiUtil.calBmi(h, w);
	}
	
	void businessProcess() {
		// 商業邏輯的程序
		this.h = h + w * 2 / 100;
		System.out.println("....");
		this.w = w + h * 30;
		System.out.println("....");
	}
}
