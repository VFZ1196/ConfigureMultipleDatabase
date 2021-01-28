package springBootMultipleDatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springBootMultipleDatabase.model.user.User;
import springBootMultipleDatabase.repository.user.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user")
	public User saveRecordAfterCheck(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@GetMapping("/user")
	public List<User> getAllRecords() {
		return userRepository.findAll();
	}

}
