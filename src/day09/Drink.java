package day09;

public class Drink extends McDonaldsProduct {
	
	public Drink(String name, int price) {
		super(name, price);
	}

	@Override
	public String getDesp() {
		return "我是麥當勞飲料";
	}
	
}
