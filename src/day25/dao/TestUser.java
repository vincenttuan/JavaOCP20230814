package day25.dao;

public class TestUser {

	public static void main(String[] args) {
		GroupBuyDao dao = GroupBuyDaoMySQL.getInstance();
		System.out.println(dao.findAllUsers());

	}

}
