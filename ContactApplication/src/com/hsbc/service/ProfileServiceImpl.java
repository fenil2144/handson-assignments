package com.hsbc.service;

import java.util.List;

import com.hsbc.dao.ProfileDao;
import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.Profile;
import com.hsbc.utility.ProfileFactory;

public class ProfileServiceImpl implements ProfileService {
	private ProfileDao profileDao = null;
	
	public ProfileServiceImpl() {
		profileDao = (ProfileDao) ProfileFactory.getInstance("dao");
	}

	@Override
	public Profile login(int profileId, String password) throws AuthenticationException {
		Profile profile = profileDao.authenticate(profileId, password);
		if(profile == null) {
			throw new AuthenticationException("Sorry something went wrong");
		}
		return profile;
	}

	@Override
	public int register(Profile profile) {
		return profileDao.register(profile);		
	}

	@Override
	public void updateProfile(Profile profile) {
		profileDao.updateProfile(profile);
	}

	@Override
	public void deleteProfile(int profileId) {
		profileDao.deleteProfile(profileId);
	}



}
