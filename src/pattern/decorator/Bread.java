package pattern.decorator;

public class Bread extends Food {
	
	public Bread() {
		name = "麵包";
		price = 40;
	}
	
	@Override
	public String getName() {
		return String.format("%s($%d)", name, price);
	}

	@Override
	public int getPrice() {
		return price;
	}

}
