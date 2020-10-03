package com.hsbc.service;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.Profile;

public interface ProfileService {
		
	public Profile login(int profileId, String password) throws AuthenticationException;
	public int register(Profile profile);
	public void updateProfile(Profile profile);
	public void deleteProfile(int profileId);

	
}
