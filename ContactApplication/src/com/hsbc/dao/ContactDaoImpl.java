package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.Contact;
import com.hsbc.utility.DBUtility;

public class ContactDaoImpl implements ContactDao {
	
	private Connection connection;

	@Override
	public void addContact(Contact contact) {
		int seq = 0;
		try {
			connection = DBUtility.getConnection();
			PreparedStatement sequenceStatement = connection.prepareStatement("values(next value for contact_seq)");
			ResultSet rs = sequenceStatement.executeQuery();
		
			if(rs.next()) {
				seq = rs.getInt(1);
			}
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into contact_details values(?,?,?,?)");
			preparedStatement.setInt(1, seq);
			preparedStatement.setString(2, contact.getContactName());
			preparedStatement.setLong(3, contact.getContactPhone());
			preparedStatement.setInt(4, contact.getProfileRef());
							
			preparedStatement.executeUpdate();
			
			sequenceStatement.close();
			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void editContact(Contact contact) {
		try {
			connection = DBUtility.getConnection();
			PreparedStatement updateStatement = connection.prepareStatement("update contact_details set contact_name=?,contact_phone=? where contact_id=?");
			updateStatement.setInt(3, contact.getContactId());
			updateStatement.setString(1, contact.getContactName());
			updateStatement.setLong(2, contact.getContactPhone());
							
			updateStatement.executeUpdate();

			updateStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteContact(int contactId) {
		try {
			connection = DBUtility.getConnection();
			PreparedStatement updateStatement = connection.prepareStatement("delete from contact_details where contact_id=?");
			updateStatement.setInt(1, contactId);
							
			updateStatement.executeUpdate();

			updateStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Contact> fetchAllContacts(int contactId) {
		List<Contact> contactList = new ArrayList<Contact>();
		 Contact contact = null;
		try {
						
			connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from contact_details");

			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				contact = new Contact();
				contact.setContactId(resultSet.getInt("contact_id"));
				contact.setContactName(resultSet.getString("contact_name"));
				contact.setContactPhone(resultSet.getLong("contact_phone"));
				contact.setProfileRef(resultSet.getInt("profile_ref"));
				contactList.add(contact);
			}

			resultSet.close();
			preparedStatement.close();
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return contactList;
	}
	
}
