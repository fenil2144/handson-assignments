package com.hsbc.model.dao;

import java.util.*;

import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;

public class CollectionBackedUserDao implements UserDao {
	
	// create a ArrayList with List reference
	private static List<User> userList = new ArrayList<User>();

	@Override
	public User store(User user) {
		userList.add(user);
		return user;
	}

	@Override
	public User[] fetchUsers() {
		User[] userArray = userList.toArray(new User[userList.size()]); 
		return userArray;
	}

	@Override
	public User updateUser(int userId, User user) throws UserNotFoundException {
		for(int i = 0;i<userList.size();i++){
			if(userList.get(i).getUserId() == userId){
				userList.add(i, user);
				return user;
			}
		}
		throw new UserNotFoundException();
	}

	@Override
	public User fetchById(int userId) throws UserNotFoundException {
		for(int i = 0;i<userList.size();i++){
			if(userList.get(i).getUserId() == userId){
				return userList.get(i);
			}
		}
		throw new UserNotFoundException();
	}

}
