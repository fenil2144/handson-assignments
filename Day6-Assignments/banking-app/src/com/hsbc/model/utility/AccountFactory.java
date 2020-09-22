package com.hsbc.model.utility;

import com.hsbc.model.business.AccountServiceImpl;
import com.hsbc.model.dao.AccountDaoImpl;

public class AccountFactory {
	
	
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new AccountDaoImpl();
			break;
		case SERVICE :
			obj = new AccountServiceImpl();
			break;
		}
		return obj;
	}

}
