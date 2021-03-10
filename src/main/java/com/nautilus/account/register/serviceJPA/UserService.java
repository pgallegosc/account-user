package com.nautilus.account.register.serviceJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nautilus.account.register.domain.User;
import com.nautilus.account.register.repositories.UserRepository;
import com.nautilus.account.register.service.IUserServices;
@Service
@Primary

public class UserService implements IUserServices{

	@Autowired
	private UserRepository userRepo;

	@Override
	public void saveUser(User user) {
		userRepo.save(user);
	}

	@Override
	public List<User> findAllUser() {
		return userRepo.findAll();
	}

	@Override
	public void delete(Integer id) {
		userRepo.deleteById(id);
		
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

	
	

}
