package uk.org.hexsaw;

import org.apache.commons.chain2.Command;
import org.apache.commons.chain2.impl.ContextBase;

import com.jadecove.chain.sample.SellVehicleChain;
import com.jadecove.chain.sample.SellVehicleContext;

public class OReillyOnJavaSampleAppPart1Page2 {
	
	public static void main(String[] args) {
		Command<String, Object, ContextBase> process = new SellVehicleChain();
		ContextBase ctx = new SellVehicleContext();
		process.execute(ctx);
	}
}