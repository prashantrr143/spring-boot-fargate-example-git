package com.prashant.service.product.model;

import java.util.Date;
import java.util.Set;

import com.prashant.service.product.model.metadata.MetaData;

public class Product {

	private String id;
	private String name;
	private Amount amount;
	private String shortDescription;
	private String longDescription;
	Set<Attribute> attributes;
	private MetaData metaData;
	private Date maxDeliveredBy;
	boolean inStock;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Set<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<Attribute> attributes) {
		this.attributes = attributes;
	}

	public MetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	public Date getMaxDeliveredBy() {
		return maxDeliveredBy;
	}

	public void setMaxDeliveredBy(Date maxDeliveredBy) {
		this.maxDeliveredBy = maxDeliveredBy;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

}
