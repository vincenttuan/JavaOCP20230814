package day07;

public class BmiUtil { // BMI 工具程式 
	
	public static double calBmi(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		return bmi;
	}

}
