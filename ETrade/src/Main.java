import java.util.ArrayList;

import bussiness.abstracts.UserService;
import bussiness.concrates.UserManager;
import core.GoogleAdapter;
import dataAccess.concrates.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> listUser = new ArrayList<User>();
		User mucahit = new User("Mücahit Tüysüz", "mchttysz6161@gmail.com","61mojo61");
		
		UserService userService = new UserManager(new HibernateUserDao(),new GoogleAdapter());
		
		if(userService.add(mucahit, listUser)) {
			listUser.add(mucahit);
		}

	}

}
