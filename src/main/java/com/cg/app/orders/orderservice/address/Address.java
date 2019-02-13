package com.cg.app.orders.orderservice.address;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private Integer flatNumber;
	private String city;
	private Integer pincode;

	public Address() {
		super();
		
	}
	
	public Integer getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(Integer flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public Address(Integer flatNumber, String city, Integer pincode) {
		super();
		this.flatNumber = flatNumber;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [flatNumber=" + flatNumber + ", city=" + city + ", pincode=" + pincode + "]";
	}
	

}
