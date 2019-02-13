package com.cg.app.orders.orderservice.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.orders.orderservice.order.MyOrder;
import com.cg.app.orders.orderservice.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository repository;

	@Override
	public List<MyOrder> getAllOrders() {

		return repository.findAll();
	}

	@Override
	public void addNewOrder(MyOrder order) {
		repository.save(order);

	}

}
