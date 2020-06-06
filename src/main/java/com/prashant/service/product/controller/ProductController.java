package com.prashant.service.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.service.product.model.Product;
import com.prashant.service.product.service.IProductService;

@RestController
@RequestMapping("/v1/products")
public class ProductController {

	private static Logger LOG = LoggerFactory.getLogger(ProductController.class);

	private IProductService productService;

	public ProductController(IProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public List<Product> allProducts() {
		LOG.info("Accessing getAllProducts");
		return this.productService.getAllProducts();
	}

}
