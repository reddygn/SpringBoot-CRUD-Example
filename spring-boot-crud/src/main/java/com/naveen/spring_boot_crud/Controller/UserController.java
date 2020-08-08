package com.naveen.spring_boot_crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.spring_boot_crud.Entity.User;
import com.naveen.spring_boot_crud.Repository.UserJpa;
import com.naveen.spring_boot_crud.Service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserJpa userJpa;

	@GetMapping(value = "/getall")
	public List<User> getUser() {
		return userJpa.findAll();
	}

	@PostMapping(value = "/create")
	public User createUser(@RequestBody User user) {
		return userJpa.saveAndFlush(user);
	}

}
