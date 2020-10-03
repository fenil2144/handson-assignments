package com.hsbc.dao;

import java.util.List;

import com.hsbc.model.Contact;

public interface ContactDao {
	public void addContact(Contact contact);
	public void editContact(Contact contact);
	public void deleteContact(int contactId);
	public List<Contact> fetchAllContacts(int profileId);
}
