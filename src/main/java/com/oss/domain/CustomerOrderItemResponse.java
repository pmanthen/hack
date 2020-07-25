package com.oss.domain;

import com.oss.common.OrderStatus;

public class CustomerOrderItemResponse {
	private int quantity;
	private String topping1;
	private String topping2;
	private String topping3;
	private OrderStatus status;
	private String description;
	private double price;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTopping1() {
		return topping1;
	}
	public void setTopping1(String topping1) {
		this.topping1 = topping1;
	}
	public String getTopping2() {
		return topping2;
	}
	public void setTopping2(String topping2) {
		this.topping2 = topping2;
	}
	public String getTopping3() {
		return topping3;
	}
	public void setTopping3(String topping3) {
		this.topping3 = topping3;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


}
