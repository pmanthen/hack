package com.oss.echo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oss.common.OrderStatus;
import com.oss.domain.CustomerOrderItemResponse;
import com.oss.domain.CustomerOrderResponse;
import com.oss.domain.OrderItemRequest;
import com.oss.domain.OrderRequest;
import com.oss.echo.model.Orders;
import com.oss.echo.repository.OrderItemRepository;
import com.oss.echo.repository.OrderRepository;
import com.oss.echo.repository.WorkStationRepository;
import com.oss.echo.model.OrderItem;



@RestController
public class EchoController {
	

	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private OrderItemRepository orderItemRepo;
	
	@Autowired
	private WorkStationRepository workRepo;
	
	@GetMapping("/echo/{name}")
    public String echo(@PathVariable String name) {
        return "Hello " + name;
    }
	
	/*@GetMapping("/orders/{orderId}")
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
    }*/
	
	
	@GetMapping("/orders/{orderId}")
    public Orders getOrders(@PathVariable Integer orderId) {
		
		
        return orderRepo.findById(orderId).get() ;
    }
	
	
	
	@PostMapping("/orders")
    public ResponseEntity<String> saveOrder(@RequestBody OrderRequest orderRequest) {
		
		Orders order = new Orders();
		
		order.setChannelName(orderRequest.getChannelName());
		order.setCreatedBy(orderRequest.getCreatedBy());
		order.setCustomerName(orderRequest.getCustomerName());
		order.setOrderNumber(orderRequest.getOrderNumber());
		
		Orders savedOrder = orderRepo.save(order );
		System.out.println(savedOrder.getOrderId());
		
		for (OrderItemRequest orderItem : orderRequest.getOrderItems()) {
			
			OrderItem item = new OrderItem();
			item.setWorkStation(workRepo.getOne(orderItem.getWorkStationId()));
			item.setOrder(savedOrder);
			orderItemRepo.save(item);
			
		}
		
	
		
		
		
		
		return new ResponseEntity<String>("",HttpStatus.CREATED);
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
