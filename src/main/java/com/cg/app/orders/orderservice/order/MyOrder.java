package com.cg.app.orders.orderservice.order;

import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.cg.app.orders.orderservice.address.Address;

@Entity
public class MyOrder {
	@Id
	private int orderId;
	private LocalDateTime orderDate;
	// private Integer customerId;
	private double ammountPaid;
	private String modeOfPayment;
	private String orderStatus;
	private int quantity;
	@Embedded
	private Address address;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public double getAmmountPaid() {
		return ammountPaid;
	}

	public void setAmmountPaid(double ammountPaid) {
		this.ammountPaid = ammountPaid;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public MyOrder() {
		super();

	}

	public MyOrder(int orderId, LocalDateTime orderDate, double ammountPaid, String modeOfPayment, String orderStatus,
			int quantity, Address address) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.ammountPaid = ammountPaid;
		this.modeOfPayment = modeOfPayment;
		this.orderStatus = orderStatus;
		this.quantity = quantity;
		this.address = address;
	}

	@Override
	public String toString() {
		return "MyOrder [orderId=" + orderId + ", orderDate=" + orderDate + ", ammountPaid=" + ammountPaid
				+ ", modeOfPayment=" + modeOfPayment + ", orderStatus=" + orderStatus + ", quantity=" + quantity
				+ ", address=" + address + "]";
	}

}
