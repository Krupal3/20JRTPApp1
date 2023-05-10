package com.infy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.spring.dao.UserDAO;
import com.infy.spring.model.User;

@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;
	
	public int createUser(User user) {
		
		return this.userDAO.saveUser(user);
	}

	
}
