package day09;

public abstract class McDonaldsProduct implements Product {
	private String name;
	private int price;
	
	public McDonaldsProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}
	
	// 自訂抽象方法
	public abstract String getDesp();

}
