package day25.dao;

import java.util.Optional;

import day25.entity.User;

public class TestUser {

	public static void main(String[] args) {
		GroupBuyDao dao = GroupBuyDaoMySQL.getInstance();
		System.out.println(dao.findAllUsers());
		
		Optional<User> userOpt1 = dao.findUserById(101);
		if(userOpt1.isPresent()) {
			User user = userOpt1.get();
			System.out.println("得到使用者: " + user);
		} else {
			System.out.println("無此使用者");
		}
		
	}

}
