package com.oss.domain;


public class OrderItemRequest {
	
	private int workStationId;
	private String status;
	private Integer quantity;
	private Integer price;
	private Integer toping1;
	
	public int getWorkStationId() {
		return workStationId;
	}
	public void setWorkStationId(int workStationId) {
		this.workStationId = workStationId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getToping1() {
		return toping1;
	}
	public void setToping1(Integer toping1) {
		this.toping1 = toping1;
	}


}
