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
	public User fetchById(int userId) throws UserNotFoundException;
}
