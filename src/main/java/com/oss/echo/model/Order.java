package com.oss.echo.model;
// Generated Jul 25, 2020 1:27:08 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Order generated by hbm2java
 */

@Entity
public class Order  implements java.io.Serializable {

	@Id
	@GeneratedValue
	@Column(name = "order_id")	
	private int orderId;
	private int orderNumber;
	private String customerName;
	private String channelName;
	private String status;
	private int createdBy;
	private Date createdDate;

	public Order() {
	}


	public Order(int orderId, int orderNumber, String channelName, String status, int createdBy, Date createdDate) {
		this.orderId = orderId;
		this.orderNumber = orderNumber;
		this.channelName = channelName;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}
	public Order(int orderId, int orderNumber, String customerName, String channelName, String status, int createdBy, Date createdDate, Set<OrderItem> orderItems) {
		this.orderId = orderId;
		this.orderNumber = orderNumber;
		this.customerName = customerName;
		this.channelName = channelName;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDate = createdDate;

	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	



}


