package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import kodlamaio.hrms.bussinies.abstracts.UserService;
import kodlamaio.hrms.entities.concrates.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
private UserService userService;

@Autowired
public UserController(UserService userService) {
	super();
	this.userService = userService;
}

public List<User> getAll() {
	return this.userService.getAll();
}
}
