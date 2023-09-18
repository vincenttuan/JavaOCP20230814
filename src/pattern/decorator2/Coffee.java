package pattern.decorator2;

public interface Coffee {
	int getCost();
	String getDesp();
}

class BasicCoffee implements Coffee {
	@Override
	public int getCost() {
		return 50;
	}
	@Override
	public String getDesp() {
		return "黑咖啡";
	}
}

class MilkDecorator implements Coffee { // 牛奶裝飾
	private Coffee coffee;
	public MilkDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public int getCost() {
		return coffee.getCost() + 10;
	}
	@Override
	public String getDesp() {
		return coffee.getDesp() + ", 牛奶";
	}
}

class SugarDecorator implements Coffee { // 糖裝飾
	private Coffee coffee;
	public SugarDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public int getCost() {
		return coffee.getCost() + 5;
	}
	@Override
	public String getDesp() {
		return coffee.getDesp() + ", 糖";
	}
}

class FoamDecorator implements Coffee { // 奶泡裝飾
	private Coffee coffee;
	public FoamDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public int getCost() {
		return coffee.getCost() + 15;
	}
	@Override
	public String getDesp() {
		return coffee.getDesp() + ", 奶泡";
	}
}








