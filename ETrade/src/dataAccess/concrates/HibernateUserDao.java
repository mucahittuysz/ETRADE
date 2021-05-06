package dataAccess.concrates;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getName()+ "adl� kullan�c� eklendi.");
		
		System.out.println(user.getName() + "adl� " + user.getEmail() + " hesap do�rulama maili g�nderildi.");
		
		System.out.println("Hesap onayland�.");
		
	}

}
