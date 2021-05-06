package entities.concretes;

import entities.abstracts.Entities;

public class User implements Entities{
private String name;
private String Email;
private String password;

public User() {}

public User(String name, String email, String password) {
	super();
	this.name = name;
	this.Email = email;
	this.password = password;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}
