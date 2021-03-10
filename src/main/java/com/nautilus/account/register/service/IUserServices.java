package com.nautilus.account.register.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nautilus.account.register.domain.User;

public interface IUserServices {
	
	void saveUser(User user);
	List<User> findAllUser();
	User findById(Integer id);
	void delete(Integer id);

}
