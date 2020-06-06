package com.prashant.service.product.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class AttributeTest {

	@Test
	public void testAttribute() {
		Attribute attribute = new Attribute();
		attribute.setKey("Name");
		attribute.setValue("Value");
		assertEquals("Name", attribute.getKey());
		assertEquals("Value", attribute.getValue());
	}

}
