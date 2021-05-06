package bussiness.concrates;

import java.util.List;
import java.util.regex.Pattern;

import java.util.regex.Matcher;

import bussiness.abstracts.UserService;
import core.AuthService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
private UserDao userDao;
private AuthService authService;



public UserManager(UserDao userDao, AuthService authService) {
	super();
	this.userDao = userDao;
	this.authService = authService;
}



@Override
public boolean add(User user, List<User> userList) {
	String regex = "(.+)@(.+)";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(user.getEmail());
	
	if(user.getPassword().length()>= 6 && matcher.matches() && user.getName().length() >= 2) {
		for(User userFor : userList) {
			if(user.getEmail()==userFor.getEmail()) {
				System.out.println("Girdi�iniz mail kullan�lmakta.");
				return false;
			}
		}
		userDao.add(user);
		authService.addUserAuth(user.getName());
		return true;
	}else {
		System.out.println(user.getName() + "Girdi�iniz bilgileri kontrol ediniz.");
		return false;
	}
	
}
}
