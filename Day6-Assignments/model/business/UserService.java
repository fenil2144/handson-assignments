package com.hsbc.model.business;

import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;
// UserService will access methods present in UserDAO
public interface UserService {
	public User storeUser(User user);
	public User[] getAllUsers();
	User fetchById(int userId) throws UserNotFoundException;
	public User updatePhoneNo(User user) throws UserNotFoundException;
	public User updatePassword(int userId, String newPassword) throws UserNotFoundException;
}
