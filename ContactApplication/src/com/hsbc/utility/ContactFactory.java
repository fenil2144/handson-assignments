package com.hsbc.utility;

import com.hsbc.dao.ContactDaoImpl;
import com.hsbc.service.ContactServiceImpl;

public class ContactFactory {
	
	public static Object getInstance(String type) {
		
		if(type.equals("dao"))
			return new ContactDaoImpl();
		else if(type.equals("service"))
			return new ContactServiceImpl();
		return null;
	}
}
