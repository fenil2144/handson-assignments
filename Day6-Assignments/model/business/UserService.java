package com.hsbc.model.business;

import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;
// UserService will access methods present in UserDAO
public interface UserService {
	public User storeUser(User user);
	public User[] getAllUsers();
	User fetchById(int userId) throws UserNotFoundException;
}
