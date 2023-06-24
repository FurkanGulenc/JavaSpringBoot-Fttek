package com.springpractium.dao;

import java.sql.Date;
import java.util.List;

import com.springpractium.model.Product;

public interface ProductRepository {
	
	List<Product> findAll();
	Product findById(Long id);
	List<Product> findByDate(Date stt);
	void create(Product product);
	Product update(Product product);
	void delete(Long id);
	
	
	
	

}
