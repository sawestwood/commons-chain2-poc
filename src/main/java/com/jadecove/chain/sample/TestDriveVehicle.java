package com.jadecove.chain.sample;

import org.apache.commons.chain2.Command;
import org.apache.commons.chain2.impl.ContextBase;

public class TestDriveVehicle implements Command<String, Object, ContextBase > {
	
	public boolean execute(ContextBase ctx) {
		System.out.println("Test drive the vehicle");
		return false;
	}
}