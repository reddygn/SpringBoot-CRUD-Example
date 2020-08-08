package com.naveen.spring_boot_crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.naveen.spring_boot_crud.Entity.User;

@Component
public interface UserJpa extends JpaRepository<User, Long> {

}
