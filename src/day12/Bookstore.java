package day12;

public class Bookstore {
	
	// 折扣方法
	void applyDiscount(String bookType) {
		String discountBookType = "電腦";
		// 方法內部類別-折扣類別
		class Discount {
			double getDiscountPercentage() {
				if(bookType.equals(discountBookType)) {
					return 10.0; // 打九折 
				} else {
					return 20.0; // 打八折 
				}
			}
		}
		
		// 建立 Discount 物件
		Discount discount = new Discount();
		System.out.printf("%s類書籍享有折扣: %.0f%%\n", bookType, discount.getDiscountPercentage());
	}
	
	// 測試
	public static void main(String[] args) {
		Bookstore bookstore = new Bookstore();
		bookstore.applyDiscount("電腦");
		bookstore.applyDiscount("小說");
	}
}
