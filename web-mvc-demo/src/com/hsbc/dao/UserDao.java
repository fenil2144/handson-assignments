package com.hsbc.dao;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.User;

public interface UserDao {
	
	public User authenticate(String username, String password) throws AuthenticationException;
	public void store(User user);
	public List<User> fetchAllUsers();
	public void updateUser(User user);
	public User getUser(int userId) throws UserNotFoundException;
	
	
}
