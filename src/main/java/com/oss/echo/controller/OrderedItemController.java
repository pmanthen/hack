package com.oss.echo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.oss.echo.domain.OrderedItem;


@RestController
public class OrderedItemController {
	
	@GetMapping("/items/{orderItemId}")
    public ResponseEntity<OrderedItem> getOrderItem(@PathVariable String orderItemId) {
		
		OrderedItem orderedItem = new OrderedItem();
		orderedItem.setWorkStationId(1235);
		orderedItem.setStatus("WIP");
		orderedItem.setItemDescription("Cheese Pizza");
		orderedItem.setOrderItemId(1000);
		orderedItem.setOrderNumber(2000);
		orderedItem.setPrice(48.35);
		orderedItem.setQuantity(1);
		orderedItem.setToping1("Onions");
		orderedItem.setToping2("Peppers");
		orderedItem.setToping3("Olives");
		
        return new ResponseEntity<>(orderedItem, HttpStatus.OK);
    }

}
