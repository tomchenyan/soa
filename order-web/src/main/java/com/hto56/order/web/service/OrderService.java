package com.hto56.order.web.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hto56.order.dto.OrderDTO;
import com.hto56.order.facade.OrderFacade;

@Service
public class OrderService {

	@Reference
	private OrderFacade orderFacade;


	public OrderDTO getOrder(String orderSn){
		return orderFacade.queryOrderByNo(orderSn);
	}
	
}
