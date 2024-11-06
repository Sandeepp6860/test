package com.interview.question.test.entity;

public class User {
	
	private int id;
	
	private Address address;
	
	private Company company;

	public User(int id, Address address, Company company) {
		super();
		this.id = id;
		this.address = address;
		this.company = company;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	

}
