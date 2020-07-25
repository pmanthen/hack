package com.oss.echo.model;
// Generated Jul 25, 2020 1:27:08 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Cateogory  implements java.io.Serializable {

	@Id
	@GeneratedValue
	@Column(name = "categoryId")	
	private int categoryId;
	private String categoryName;
	

	public Cateogory() {
	}


	public Cateogory(int categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}


	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}





}


