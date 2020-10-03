package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.Profile;
import com.hsbc.utility.DBUtility;

public class ProfileDaoImpl implements ProfileDao {
	private Connection connection;
	

	@Override
	public int register(Profile profile) {
		int seq = 0;
		try {
			connection = DBUtility.getConnection();
			PreparedStatement sequenceStatement = connection.prepareStatement("values(next value for profile_seq)");
			ResultSet rs = sequenceStatement.executeQuery();
		
			if(rs.next()) {
				seq = rs.getInt(1);
			}
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into profile values(?,?,?,?,?)");
			preparedStatement.setInt(1, seq);
			preparedStatement.setString(2, profile.getProfileName());
			preparedStatement.setString(3, profile.getPassword());
			preparedStatement.setLong(4, profile.getPhone());
			preparedStatement.setString(5, profile.getDob());
							
			preparedStatement.executeUpdate();
			
			sequenceStatement.close();
			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return seq;
	}

	@Override
	public Profile authenticate(int profileId, String password) throws AuthenticationException {
		Profile profile = null;
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from profile where profile_id = ? and password = ?");
			preparedStatement.setInt(1, profileId);
			preparedStatement.setString(2, password);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				profile = new Profile();
				profile.setProfileId(resultSet.getInt("profile_id"));
				profile.setProfileName(resultSet.getString("name"));
				profile.setPassword(resultSet.getString("password"));
				profile.setPhone(resultSet.getLong("phone"));
				profile.setDob(resultSet.getString("dob"));
				return profile;
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			if(profile == null) {
				throw new AuthenticationException("Sorry Profilename or Password is Incorrect");
			} 
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return profile;

	}

	@Override
	public void updateProfile(Profile profile) {
		try {
			connection = DBUtility.getConnection();
			PreparedStatement updateStatement = connection.prepareStatement("update profile set phone=?,password=?,dob=?,name=? where profile_id=?");
			updateStatement.setInt(5, profile.getProfileId());
			updateStatement.setString(4, profile.getProfileName());
			updateStatement.setString(3, profile.getDob());
			updateStatement.setString(2, profile.getPassword());
			updateStatement.setLong(1, profile.getPhone());
							
			updateStatement.executeUpdate();

			updateStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteProfile(int profileId) {
		try {
			connection = DBUtility.getConnection();
			PreparedStatement updateStatement = connection.prepareStatement("delete from profile where profile_id=?");
			updateStatement.setInt(1, profileId);
							
			updateStatement.executeUpdate();

			updateStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
