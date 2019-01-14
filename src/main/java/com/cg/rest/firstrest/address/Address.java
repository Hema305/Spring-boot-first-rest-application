package com.cg.rest.firstrest.address;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int flatNumber;
	private String city;
	private int pincode;

	public Address() {
		super();
		
	}
	@Override
	public String toString() {
		return "Address [flatNumber=" + flatNumber + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public int getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
