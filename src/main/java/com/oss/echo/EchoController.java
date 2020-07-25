package com.oss.echo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.oss.common.OrderStatus;
import com.oss.domain.CustomerOrderItemResponse;
import com.oss.domain.CustomerOrderResponse;
import com.oss.echo.model.Order;
import com.oss.echo.model.OrderItem;



@RestController
public class EchoController {
	
	@GetMapping("/echo/{name}")
    public String echo(@PathVariable String name) {
        return "Hello " + name;
    }
	
	@GetMapping("/orders/{orderId}")
    public CustomerOrderResponse getOrders(@PathVariable String orderId) {
		CustomerOrderResponse ret = new CustomerOrderResponse();
		ret.setChannel("Web");
		ret.setCustomerName("Bob");
		ret.setOrderStatus(OrderStatus.WIP);
		ret.setTotalPrice(255.23);
		List<CustomerOrderItemResponse> a= new ArrayList<CustomerOrderItemResponse>();
		
		
		CustomerOrderItemResponse item = new CustomerOrderItemResponse();
		item.setDescription("Burger");
		item.setStatus(OrderStatus.WIP);
		a.add(item);
		ret.setOrderItems(a);
		
        return ret ;
    }
	
	@GetMapping("/workstations/{wid}/items")
    public List<CustomerOrderItemResponse> getWorkstationBacklog(@PathVariable String wid) {
		List<CustomerOrderItemResponse> a = new ArrayList<CustomerOrderItemResponse>();
		CustomerOrderItemResponse item = new CustomerOrderItemResponse();
		item.setDescription("Burger");
		item.setStatus(OrderStatus.ORDER_RECEIVED);
		
		CustomerOrderItemResponse item1 = new CustomerOrderItemResponse();
		item.setDescription("Pizza");
		item.setStatus(OrderStatus.WIP);
		
		CustomerOrderItemResponse item2 = new CustomerOrderItemResponse();
		item.setDescription("Sandwich");
		item.setStatus(OrderStatus.ORDER_RECEIVED);
		
		a.add(item);
		a.add(item1);
		a.add(item2);
		

        return a;
    }

}
