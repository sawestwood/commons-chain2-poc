package com.jadecove.chain.sample;

import org.apache.commons.chain2.Command;


//public class GetCustomerInfo implements Command<K, V, Map<K,V>> {
//	public boolean execute(Context ctx) throws Exception {
//		System.out.println("Get customer info");
//		ctx.put("customerName","George Burdell");
//		return false;
//	}
//}

public class GetCustomerInfo implements Command<String, Object, GetCustomerInfoContext > {

	@Override
	public boolean execute(GetCustomerInfoContext ctx) {
		System.out.println("Get customer info");
		ctx.put("customerName","George Burdell");
		return false;
	}
	
} 