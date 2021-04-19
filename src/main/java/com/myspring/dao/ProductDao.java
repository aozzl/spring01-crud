package com.myspring.dao;

import com.myspring.po.Product;

import java.util.List;

public interface ProductDao {
	default void saveProduct(Product product){}

	void updateProduct(Product product);

	default void deleteProduct(int id){}

	List<Product> findAll();

	default Product findById(int id){return null;}
}
