package com.jadecove.chain.sample;

import org.apache.commons.chain2.Command;

public class NegotiateSale implements Command<String, Object, GetCustomerInfoContext> {

	@Override
	public boolean execute(GetCustomerInfoContext ctx) {
		System.out.println("Negotiate sale");
		return false;
	}
}
