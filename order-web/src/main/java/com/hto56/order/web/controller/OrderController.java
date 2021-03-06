package com.hto56.order.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hto56.order.dto.OrderDTO;
import com.hto56.order.web.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/order/{sn}")
	public OrderDTO getDTO(@PathVariable("sn") String sn){
		return orderService.getOrder(sn);
	}
}
