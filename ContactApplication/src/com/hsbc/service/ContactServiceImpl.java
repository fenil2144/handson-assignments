package com.hsbc.service;

import java.util.List;

import com.hsbc.dao.ContactDao;
import com.hsbc.dao.ProfileDao;
import com.hsbc.model.Contact;
import com.hsbc.utility.ContactFactory;

public class ContactServiceImpl implements ContactService {
	private ContactDao contactDao;
	

	public ContactServiceImpl() {
		contactDao = (ContactDao) ContactFactory.getInstance("dao");
	}

	@Override
	public void addContact(Contact contact) {
		contactDao.addContact(contact);
		
	}

	@Override
	public void editContact(Contact contact) {
		contactDao.editContact(contact);
		
	}

	@Override
	public void deleteContact(int contactId) {
		contactDao.deleteContact(contactId);
		
	}

	@Override
	public List<Contact> fetchAllContacts(int profileId) {
		return contactDao.fetchAllContacts(profileId);
	}


	
}
