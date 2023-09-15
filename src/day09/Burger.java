package day09;

public class Burger extends McDonaldsProduct {
	
	public Burger(String name, int price) {
		super(name, price);
	}

	@Override
	public String getDesp() {
		return "我是麥當勞漢堡";
	}
	
}
