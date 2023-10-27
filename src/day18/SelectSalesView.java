package day18;

public class SelectSalesView {

	public static void main(String[] args) {
		String sql = "SELECT "
				+ "	no, date, product_id, branch_id, city_id, "
				+ "    product_name, price as product_price, qty as product_qty, "
				+ "    branch_name, name as city_name "
				+ " FROM demo.sales_view;";
		
	}

}
