package pattern.decorator;

public class Sidedish extends Food {
	
	protected Food food;
	
	public Sidedish(Food food) {
		this.food = food;
	}

	@Override
	public String getName() {
		return name + " + " + food.getName();
	}

	@Override
	public int getPrice() {
		return price + food.getPrice();
	}
	
	
	
}
