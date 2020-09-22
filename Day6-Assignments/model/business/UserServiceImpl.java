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
		return dao.fetchById(userId);
	}

	@Override
	public User updatePhoneNo(User user) throws UserNotFoundException {
		User userFetched = dao.fetchById(user.getUserId());
		userFetched.setPhone(user.getPhone());
		return dao.updateUser(userFetched.getUserId(), userFetched);
	}

	@Override
	public User updatePassword(int userId, String newPassword) throws UserNotFoundException {
		User user = dao.fetchById(userId);
		user.setPassword(newPassword);
		return dao.updateUser(userId, user);
	}
}
