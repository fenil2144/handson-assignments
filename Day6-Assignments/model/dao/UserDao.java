package com.hsbc.model.dao;

import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;

/*
 * This interface must have more than 4 methods
 * 
 */
public interface UserDao {
	public User store(User user);
	public User[] fetchUsers();
	
	// Throws exception if userId not found else returns user
	public User fetchById(int userId) throws UserNotFoundException;	
	
	// pass updated user and reflect to the database/array/collection & return the same user
	public User updateUser(int userId, User user) throws UserNotFoundException;
}
