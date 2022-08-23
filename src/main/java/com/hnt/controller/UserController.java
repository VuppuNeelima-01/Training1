package com.hnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hnt.entity.User;
import com.hnt.service.UserService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController//spring bean

@RequestMapping("/UserController")
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping("/GetUser")
	String getUser()
	{
		return "test";
	}
	@PostMapping("/Saveuser")
	void saveUser(@RequestBody User user)
	{
	//Log.debug(user.getName());
		userService.save(user);
		
		System.out.println();
	}

}
