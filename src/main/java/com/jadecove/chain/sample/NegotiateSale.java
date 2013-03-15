package com.jadecove.chain.sample;

import org.apache.commons.chain2.Command;
import org.apache.commons.chain2.impl.ContextBase;

public class NegotiateSale implements Command<String, Object, ContextBase> {

	@Override
	public boolean execute(ContextBase ctx) {
		System.out.println("Negotiate sale");
		return false;
	}
}
