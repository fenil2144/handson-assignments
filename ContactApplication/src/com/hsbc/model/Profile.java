package com.hsbc.model;

public class Profile {
	
	private int profileId;
	private String profileName;
	private String password;
	private long phone;
	private String dob;
	
	public Profile() {
		super();
	}

	public Profile(int profileId, String profileName, String password, long phone, String dob) {
		super();
		this.profileId = profileId;
		this.profileName = profileName;
		this.password = password;
		this.phone = phone;
		this.dob = dob;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", profileName=" + profileName + ", password=" + password
				+ ", phone=" + phone + ", dob=" + dob + "]";
	}
	

}
