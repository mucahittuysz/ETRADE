package dataAccess.concrates;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getName()+ "adlý kullanýcý eklendi.");
		
		System.out.println(user.getName() + "adlý " + user.getEmail() + " hesap doðrulama maili gönderildi.");
		
		System.out.println("Hesap onaylandý.");
		
	}

}
