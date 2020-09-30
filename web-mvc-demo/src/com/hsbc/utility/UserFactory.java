package com.hsbc.utility;

import com.hsbc.dao.JdbcBackedUserDaoImpl;
import com.hsbc.service.UserServiceImpl;

public class UserFactory {
	
	public static Object getInstance(String type) {
		
		if(type.equals("dao"))
			return new JdbcBackedUserDaoImpl();
		else if(type.equals("service"))
			return new UserServiceImpl();
		return null;
	}

}
