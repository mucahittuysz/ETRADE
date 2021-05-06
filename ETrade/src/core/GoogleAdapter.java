package core;

import Google.Google;

public class GoogleAdapter implements AuthService {

	@Override
	public void addUserAuth(String message) {
		Google google = new Google();
		google.addUser(message);
		
	}


}
