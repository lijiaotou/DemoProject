package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDAO;

@Service("userService")
public class UserService {
 
	@Autowired
	private UserDAO userDAO;
	
	
	public UserDAO getUserDAO() {
		return userDAO;
	}


	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}


	public void saveUser(){
		this.userDAO.save();
		System.out.println("service save user");
	}
}
