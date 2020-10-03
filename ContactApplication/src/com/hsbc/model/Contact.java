package com.hsbc.model;

public class Contact {
	
	private int contactId;
	private String contactName;
	private long contactPhone;
	private int profileRef;
	
	public Contact() {
		super();
	}
	public Contact(int contactId, String contactName, long contactPhone, int profileRef) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.profileRef = profileRef;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public long getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(long contactPhone) {
		this.contactPhone = contactPhone;
	}
	public int getProfileRef() {
		return profileRef;
	}
	public void setProfileRef(int profileRef) {
		this.profileRef = profileRef;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactPhone=" + contactPhone
				+ ", profileRef=" + profileRef + "]";
	}

	
}
