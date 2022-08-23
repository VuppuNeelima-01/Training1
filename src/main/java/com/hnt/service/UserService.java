package com.hnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.UserRepository;
import com.hnt.entity.User;

@Service
public class UserService {
@Autowired
UserRepository userRepo;
	public void save(User user) {
		userRepo.save(user);
	
		
	}
	

}
