package com.microcare.microservice.microcare_microservice;

import java.time.LocalDate;

public class User {
	
	private String firstName;
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", address=" + address
				+ ", dob=" + dob + "]";
	}
	private String lastName;
	private long phone;
	private String address;
	private LocalDate dob;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
