package day08;

public class Change3 {

	public static void main(String[] args) {
		
		Money[] moneyArray = {
				new Note(500, "500元"),
				new Note(100, "100元"),
				new Coin(50, "50元"),
				new Coin(10, "10元"),
				new Coin(5, "5元"),
				new Coin(1, "1元"),
		}; 
		
		int price = 23;
		int amount = 1000;
		int change = amount - price;
		System.out.printf("找零金額: %d\n", change);
		
		// 全部零錢都有
		for(Money money : moneyArray) {
			int count = money.computeCount(change); // 得到個(張)數
			change = change - (money.getValue() * count); // 減去已經找零的
			money.display();
		}
		
		// 100, 50 零錢沒有
		
	}

}
