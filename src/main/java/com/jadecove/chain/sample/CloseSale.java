package com.jadecove.chain.sample;

import org.apache.commons.chain2.Command;

public class CloseSale implements Command<String, Object, GetCustomerInfoContext > {

	@Override
	public boolean execute(GetCustomerInfoContext ctx) {
		System.out.println("Congratulations "
                +ctx.get("customerName")
			+", you bought a new car!");
		return false;	}

}
