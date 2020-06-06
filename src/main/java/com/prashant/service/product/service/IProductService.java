package com.prashant.service.product.service;

import java.util.List;

import com.prashant.service.product.model.Product;

public interface IProductService {

	public List<Product> getAllProducts();
	
	List<Product> getProductsBy(String brandName);
	
	Product getProductById(String productId);
}
