package com.naveen.spring_boot_crud.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.spring_boot_crud.Entity.User;
import com.naveen.spring_boot_crud.Service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value = "/getall")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping(value = "/getuser/{id}")
	public Optional<User> getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	@PostMapping(value = "/create")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@DeleteMapping(value = "/delete/{id}")
	public List<User> deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}

}
