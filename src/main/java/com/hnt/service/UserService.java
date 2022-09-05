package com.hnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.UserRepository;
import com.hnt.entity.User;

@Service
public class UserService {
@Autowired
UserRepository userRepo;
public User save(User user) {
	if (user.getName().equals("Ram"))
		throw new IllegalArgumentException("message");
	else
		userRepo.save(user);
	return user;
}
	public Iterable<User> getUser() {
	
		// TODO Auto-generated method stub
		return userRepo.findAll();
		
	}
	public void delete(int userid) {
		userRepo.deleteById(userid);
	}
	

}
