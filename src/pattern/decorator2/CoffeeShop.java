package pattern.decorator2;

public class CoffeeShop {

	public static void main(String[] args) {
		Coffee coffee = new BasicCoffee();
		print(coffee);
		
		coffee = new MilkDecorator(coffee);
		print(coffee);
		
		coffee = new SugarDecorator(coffee);
		print(coffee);
		
		coffee = new FoamDecorator(coffee);
		print(coffee);
		
	}
	
	private static void print(Coffee coffee) {
		System.out.println(coffee.getDesp());
		System.out.println(coffee.getCost());
	}

}
