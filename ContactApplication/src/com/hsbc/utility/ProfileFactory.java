package com.hsbc.utility;

import com.hsbc.dao.ProfileDaoImpl;
import com.hsbc.service.ProfileServiceImpl;

public class ProfileFactory {
	
	public static Object getInstance(String type) {
		
		if(type.equals("dao"))
			return new ProfileDaoImpl();
		else if(type.equals("service"))
			return new ProfileServiceImpl();
		return null;
	}

}
