package com.oss.echo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.oss.echo.model.Order;
import com.oss.echo.model.OrderItem;



@RestController
public class EchoController {
	
	@GetMapping("/echo/{name}")
    public String echo(@PathVariable String name) {
        return "Hello " + name;
    }
	
	@GetMapping("/orders/{orderId}")
    public List<Order> getOrders(@PathVariable String orderId) {
		List<Order> ret = new ArrayList<Order>();
		
        return ret ;
    }
	
	@GetMapping("/workstations/{wid}/items")
    public List<OrderItem> getWorkstationBacklog(@PathVariable String wid) {
		List<OrderItem> ret = new ArrayList<OrderItem>();
        return ret;
    }

}
