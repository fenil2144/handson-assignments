package com.hsbc.model.business;

import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;
import com.hsbc.model.dao.UserDao;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class UserServiceImpl implements UserService {

	private UserDao dao;
	public UserServiceImpl() {
		// this is the way you get different instance
		dao = (UserDao)UserFactory.getInstance(Type.DAO);
	}
	@Override
	public User storeUser(User user) {
		// no business validation
		User createdUser =  dao.store(user);
		return createdUser;
	}
	@Override
	public User[] getAllUsers() {
		// no business validations
		return dao.fetchUsers();
	}
	
	@Override
	public User fetchById(int userId) throws UserNotFoundException {
		// no business validations
		return dao.fetchById(userId);
	}
}
