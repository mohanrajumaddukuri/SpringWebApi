package com.myprojects.model;

import org.springframework.beans.factory.annotation.Value;

public class Customer {
	
	public long id;
	public String name;
	public String city;
	
	public Customer(long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
