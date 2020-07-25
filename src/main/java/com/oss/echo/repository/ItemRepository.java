package com.oss.echo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oss.echo.model.Cateogory;
import com.oss.echo.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{	
	 
}
