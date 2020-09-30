package com.hsbc.service;

import java.util.List;

import com.hsbc.dao.UserDao;
import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.User;
import com.hsbc.utility.UserFactory;

public class UserServiceImpl implements UserService {
	private UserDao userDao = null;
	
	public UserServiceImpl() {
		userDao = (UserDao) UserFactory.getInstance("dao");
	}

	@Override
	public User login(String username, String password) throws AuthenticationException {
		User user = userDao.authenticate(username, password);
		if(user == null) {
			throw new AuthenticationException("Sorry something went wrong");
		}
		return user;
	}

	@Override
	public void createUser(User user) {
		userDao.store(user);		
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public User getUser(int userId) throws UserNotFoundException{
		User user = userDao.getUser(userId);
		if(user == null) {
			throw new UserNotFoundException();
		}
		return user;
	}

	@Override
	public List<User> fetchAllUsers() {
		return userDao.fetchAllUsers();
	}

}
