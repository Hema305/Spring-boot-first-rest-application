package com.cg.order.website.eshoppingwebsite.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.cg.order.website.eshoppingwebsite.entity.Orders;
@Controller
@EnableOAuth2Sso
public class EshoppingController {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/UpdateStatusForm")
	public String deposit() {
		return "UpdateStatusForm";
	}

	@RequestMapping("/PlaceOrderForm")
	public String FundTransferForm() {
		return "PlaceOrderForm";
	}

	@RequestMapping("/GetAllOrdersForm")
	public String withdraw() {
		return "GetAllOrdersForm";
	}
	@RequestMapping("/update")
	public String updateStatus(@ModelAttribute Orders orders,Model model) {
		restTemplate.put("http://localhost:9090/orders/"+orders.getOrderId()+"?orderStatus="+orders.getOrderStatus(), null);
		//orders.setOrderStatus(orders.getOrderStatus());
		model.addAttribute("message","Success!");
		return "UpdateStatusForm";
	}
	@RequestMapping("/newOrder")
	public String placeOrder(@ModelAttribute Orders orders,Model model) {
		restTemplate.postForEntity("http://localhost:9090/orders", orders, null);
		//orders.setOrderStatus(orders.getOrderStatus());
		model.addAttribute("message","Success!");
		return "PlaceOrderForm";
	}
	
	  
}
