package com.hto56.business;

import org.springframework.stereotype.Service;

import com.hto56.order.dto.OrderDTO;
import com.hto56.order.entity.OrderEntity;
import com.hto56.order.facade.OrderFacade;

@Service
public class OrderBuzImpl implements OrderFacade{

	public OrderDTO queryOrderByNo(String orderSn) {
		OrderDTO orderDTO = new OrderDTO();
		OrderEntity order = new OrderEntity();
		order.setStoreId("JDIPHONE0000001");
		order.setOrderAmount(5888.88);
		order.setBuyerName("�ܽ���");
		order.setOrderSn(orderSn);
		orderDTO.setOrder(order );
		return orderDTO;
	}

}
