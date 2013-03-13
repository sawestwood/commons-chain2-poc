package com.jadecove.chain.sample;

import org.apache.commons.chain2.Command;

public class TestDriveVehicle implements Command<String, Object, GetCustomerInfoContext > {
	
	public boolean execute(GetCustomerInfoContext ctx) {
		System.out.println("Test drive the vehicle");
		return false;
	}
}