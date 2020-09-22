package com.hsbc.model.dao;

import java.security.Provider.Service;

import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;
import com.hsbc.model.business.UserService;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class ArrayBackedUserDao implements UserDao {

	// temporary database
	private static User[] userArray = new User[10];
	
	private static int index = 0;
	
	@Override
	public User store(User user) {
		userArray[index++] = user;
		return user;
	}
	@Override
	public User[] fetchUsers() {
		return userArray;
	}
	@Override
	public User fetchById(int userId) throws UserNotFoundException{
		User user = null;
		for(int i = 0; i< index; i++){
			if(userArray[i].getUserId() == userId){
				user = userArray[i];
				return user;
			}
		}
		throw new UserNotFoundException();
		
	}

}
