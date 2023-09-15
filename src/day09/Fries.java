package day09;

public class Fries extends McDonaldsProduct {
	
	public Fries(String name, int price) {
		super(name, price);
	}

	@Override
	public String getDesp() {
		return "我是麥當勞薯條";
	}
	
}
