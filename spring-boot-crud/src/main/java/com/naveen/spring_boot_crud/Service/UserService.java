package com.naveen.spring_boot_crud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.naveen.spring_boot_crud.Entity.User;
import com.naveen.spring_boot_crud.Repository.UserJpa;

@Component
public class UserService {

	@Autowired
	UserJpa userJpa;

	public List<User> getUsers() {

		return userJpa.findAll();
	}

	public User createUser(User user) {
		return userJpa.saveAndFlush(user);
	}

	public Optional<User> getUserById(Long id) {
		return userJpa.findById(id);
	}

	public List<User> deleteUser(Long id) {
		userJpa.deleteById(id);
		return userJpa.findAll();
	}

}
