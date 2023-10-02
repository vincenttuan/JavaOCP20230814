package day12;

public class Bookstore {
	
	// 折扣方法
	void applyDiscount(String bookType) {
		
		// 方法內部類別-折扣類別
		class Discount {
			double getDiscountPercentage() {
				if(bookType.equals("電腦")) {
					return 10.0; // 打九折 
				} else {
					return 20.0; // 打八折 
				}
			}
		}
		
		// 建立 Discount 物件
		Discount discount = new Discount();
		System.out.printf("%s 書籍享有折扣: %.0f\n", bookType, discount.getDiscountPercentage());
	}
	
}
