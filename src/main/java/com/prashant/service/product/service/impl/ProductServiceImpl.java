package com.prashant.service.product.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.prashant.service.product.model.Amount;
import com.prashant.service.product.model.Attribute;
import com.prashant.service.product.model.Product;
import com.prashant.service.product.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	private static Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Override
	public List<Product> getAllProducts() {
		LOG.info("Invoked  getAllProducts");
		return createDummyProdcutList();
	}

	@Override
	public List<Product> getProductsBy(String brandName) {
		throw new IllegalStateException("getProductsBy : Yet to be implemented");
	}

	@Override
	public Product getProductById(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<Product> createDummyProdcutList() {
		List<Product> productList = new ArrayList<>();

		Set<Attribute> chargerAttributes = new HashSet<>();
		chargerAttributes.add(new Attribute("Brand", "Artis"));
		chargerAttributes.add(new Attribute("Model", "AR-60W-MG1"));
		chargerAttributes.add(new Attribute("Product Dimensions", "6.5 x 2.5 x 6.5 cm"));
		chargerAttributes.add(new Attribute("Item model number", "AR-60W-MG1"));
		chargerAttributes.add(new Attribute("Compatible Devices", "Laptops"));
		chargerAttributes.add(new Attribute("Included Components", "Compatible Laptop Adapter"));
		chargerAttributes.add(new Attribute("Wattage", "60 Watts"));
		chargerAttributes.add(new Attribute("Batteries Included", "No"));
		chargerAttributes.add(new Attribute("Material", "Non-Recyled Virgin Plastic"));

		Product laptopCharger = new Product();
		laptopCharger.setId(UUID.randomUUID().toString());
		laptopCharger.setName(
				"Artis AR-60W-MG1 60 Watts Laptop Adapter/Charger for MB Pro 13”/MacBook Unibody (16.5V, 3.65A) (L-Tip Connector)");
		Amount amount = new Amount();
		amount.setActualPrice(BigDecimal.valueOf(450d));
		amount.setDiscountedPrice(BigDecimal.valueOf(399d));
		amount.setDiscount(51d);
		laptopCharger.setAmount(amount);
		laptopCharger.setInStock(true);
		laptopCharger.setAttributes(chargerAttributes);

		laptopCharger.setLongDescription(
				"Pin size: 5.5mm x 2.1mm,Output: 19V/3.42A ; Total: 65 watts,100% compatibility. India BIS Certified Adapter, Regulates output voltage automatically. Short Circuit/Overload protection, High Temperature Protection, CE, FCC, ROHS Compliant, 3 Pin AC Cord ");
		laptopCharger.setShortDescription(
				"Artis AR-60W-MG1 60 Watts Laptop Adapter/Charger for MB Pro 13”/MacBook Unibody (16.5V, 3.65A) (L-Tip Connector)");

		productList.add(laptopCharger);

		return productList;
	}
}
