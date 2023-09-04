package day07;

public class Bmi2 {
	private double h;
	private double w;
	
	double getBmi() {
		return BmiUtil.calBmi(h, w);
	}
}
