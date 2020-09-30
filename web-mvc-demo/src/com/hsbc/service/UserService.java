package com.hsbc.service;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.User;

public interface UserService {
		
	public User login(String username, String password) throws AuthenticationException;
	public void createUser(User user);
	public void updateUser(User user);
	public User getUser(int userId) throws UserNotFoundException;
	public List<User> fetchAllUsers();
}
