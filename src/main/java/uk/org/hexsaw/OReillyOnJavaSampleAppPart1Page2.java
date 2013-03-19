package uk.org.hexsaw;

import org.apache.commons.chain2.Command;
import org.apache.commons.chain2.impl.ContextBase;

import com.jadecove.chain.sample.SellVehicleChain;
import com.jadecove.chain.sample.SellVehicleContext;

/**
 * This revisits example code demonstrating use of the <b>Apache Commons Commons-Chains</b> framework, first 
 * published in  March 2005 on the O'Reilly OnJava site http://www.onjava.com/pub/a/onjava/2005/03/02/commonchains.html. 
 * In this instance, the sample is implemented using commons-chain2.
 */
public class OReillyOnJavaSampleAppPart1Page2 {
	
	public static void main(String[] args) {
		Command<String, Object, ContextBase> process = new SellVehicleChain();
		ContextBase ctx = new SellVehicleContext();
		process.execute(ctx);
	}
}