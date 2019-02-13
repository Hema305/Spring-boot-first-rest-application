package com.cg.app.orders.orderservice;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.app.orders.orderservice.address.Address;
import com.cg.app.orders.orderservice.order.MyOrder;

import com.cg.app.orders.orderservice.order.repository.OrderRepository;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner populateData(OrderRepository repository)
	{
		return (arg)-> {
			repository.save(new MyOrder(101,LocalDateTime.now(), 4000, "card", "coming", 2, new Address(16, "nellore", 524)));
			
		};
	}

}

