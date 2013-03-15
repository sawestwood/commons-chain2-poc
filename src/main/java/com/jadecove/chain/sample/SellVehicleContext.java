package com.jadecove.chain.sample;

import org.apache.commons.chain2.impl.ContextBase;

public class SellVehicleContext extends ContextBase {

	private static final long serialVersionUID = -7006353535778118202L;
	
	private String customerName;

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String name) {
		this.customerName = name;
	}
}