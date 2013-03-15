package uk.org.hexsaw;

import org.apache.commons.chain2.Command;

import com.jadecove.chain.sample.GetCustomerInfoContext;
import com.jadecove.chain.sample.SellVehicleChain;

public class OReillyOnJavaSampleAppPart1Page1 {
	public static void main(String[] args) {
		Command<String, Object, GetCustomerInfoContext> process = new SellVehicleChain();
		GetCustomerInfoContext ctx = new GetCustomerInfoContext();
		process.execute(ctx);
	}
}