package kodlamaio.hrms.bussinies.concrates;

import java.util.List;

import kodlamaio.hrms.bussinies.abstracts.UserService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concrates.User;

public class UserManager implements UserService {
private UserDao userDao;

	public UserManager(UserDao userDao) {
	super();
	this.userDao = userDao;
}
	@Override
	public List<User> getAll() {

		return this.userDao.findAll();
	}

}
