package com.hsbc.dao;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.Profile;

public interface ProfileDao {
	
	public int register(Profile profile);
	public Profile authenticate(int profileId, String password) throws AuthenticationException; 
	public void updateProfile(Profile profile);
	public void deleteProfile(int profileId);

}
