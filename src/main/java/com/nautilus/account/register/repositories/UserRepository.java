package com.nautilus.account.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nautilus.account.register.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
