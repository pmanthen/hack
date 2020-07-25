package com.oss.domain;

import java.util.List;

import com.oss.common.OrderStatus;

public class CustomerOrderResponse {
	private String customerName;
	private String channel;
	private OrderStatus orderStatus;
	private double totalPrice;
	private List<CustomerOrderItemResponse> orderItems;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<CustomerOrderItemResponse> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<CustomerOrderItemResponse> orderItems) {
		this.orderItems = orderItems;
	}



}
