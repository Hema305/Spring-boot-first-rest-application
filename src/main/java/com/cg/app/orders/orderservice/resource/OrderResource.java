package com.cg.app.orders.orderservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.orders.orderservice.order.MyOrder;
import com.cg.app.orders.orderservice.order.service.OrderService;




@RestController
@RequestMapping("/orders") // Addressable resource
public class OrderResource {

	@Autowired
	private OrderService service;
	
	@PostMapping // uniform constrain interface
	public void addNewOrder(@RequestBody MyOrder order) {
		service.addNewOrder(order);
	}

	@GetMapping // uniform constrain interface
	public List<MyOrder> getAllOrders() {
		return service.getAllOrders();
	}


	
	

}
