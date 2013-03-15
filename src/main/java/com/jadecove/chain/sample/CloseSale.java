package com.jadecove.chain.sample;

import org.apache.commons.chain2.Command;
import org.apache.commons.chain2.impl.ContextBase;

public class CloseSale implements Command<String, Object, ContextBase > {

	@Override
	public boolean execute(ContextBase ctx) {
		System.out.println("Congratulations " + ctx.get("customerName") + ", you bought a new car!");
		return false;	
	}
	
	public boolean execute(SellVehicleContext ctx) {
		System.out.println("Congratulations " + ctx.getCustomerName() + ", you bought a new car!");
		return false;	
	}	

}
