package com.naveen.spring_boot_crud.Service;

import org.springframework.stereotype.Component;

import com.naveen.spring_boot_crud.Entity.User;

@Component
public class UserService {

	public User getUser() {
		User u = new User();
		u.setId(1);
		u.setName("Naveen");
		u.setSalary(12000);
		return u;
	}

}
