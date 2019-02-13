package com.cg.app.orders.orderservice.order.service;

import java.util.List;

import com.cg.app.orders.orderservice.order.MyOrder;


public interface OrderService {

	
	List<MyOrder> getAllOrders();

	void addNewOrder(MyOrder order);
	
}