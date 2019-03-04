package com.springBoot.project.restController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.project.bo.UserBO;
import com.springBoot.project.dao.UserRepo;

@RestController
public class ControlClass {
	
	@Autowired
	private UserRepo UserRepo;
	
	@RequestMapping("/hello")
	public String helloWorld() {
		System.out.println("Hello World Controller");
		return "Hello World Controller";
	}
	
	@RequestMapping(value="/registerUser", method = RequestMethod.GET)
	@ResponseBody
	public String registerUser(@RequestParam int id, String name) {
		UserBO user = new UserBO(2,"asd");
		UserRepo.save(user);
		return "response";
	}
	
	@RequestMapping(value="/getAllUsers", method = RequestMethod.GET)
	@ResponseBody
	public List<UserBO> getUserDetails() {
		List<UserBO> users = UserRepo.findAll();
		return users;
	}
	
	@RequestMapping(value="/getUser", method = RequestMethod.GET)
	@ResponseBody
	public UserBO getDetails(@RequestParam int id) {
		UserBO user = UserRepo.findOne(id);
//		UserRepo.findById()
		System.out.println("Hello World registerUser"+id);
		return user;
	}
	
	

}
