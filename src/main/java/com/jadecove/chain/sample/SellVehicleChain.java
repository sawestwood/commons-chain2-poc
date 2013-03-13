package com.jadecove.chain.sample;

import org.apache.commons.chain2.impl.ChainBase;

public class SellVehicleChain extends ChainBase<String, Object, GetCustomerInfoContext > {
	
	public SellVehicleChain() {
		super();
		this.addCommand(new GetCustomerInfo());
		this.addCommand(new TestDriveVehicle());
		this.addCommand(new NegotiateSale());
		this.addCommand(new ArrangeFinancing());
		this.addCommand(new CloseSale());
	}
	
}
