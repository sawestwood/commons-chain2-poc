package com.jadecove.chain.sample;

import org.apache.commons.chain2.Command;
import org.apache.commons.chain2.impl.ContextBase;


//public class GetCustomerInfo implements Command<K, V, Map<K,V>> {
//	public boolean execute(Context ctx) throws Exception {
//		System.out.println("Get customer info");
//		ctx.put("customerName","George Burdell");
//		return false;
//	}
//}

public class GetCustomerInfo implements Command<String, Object, ContextBase > {

	@Override
	public boolean execute(ContextBase ctx) {
		System.out.println("Get customer info");
		ctx.put("customerName","George Burdell");
		return false;
	}
	
} 