package com.oss.echo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oss.echo.model.Cateogory;

@Repository
public interface CategoryRepository extends JpaRepository<Cateogory, Integer>{	
	 
}
