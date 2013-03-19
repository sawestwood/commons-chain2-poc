package uk.org.hexsaw;

import java.net.URL;

import org.apache.commons.chain2.Catalog;
import org.apache.commons.chain2.CatalogFactory;
import org.apache.commons.chain2.config.ConfigParser;
import org.apache.commons.chain2.impl.CatalogFactoryBase;
import org.apache.commons.chain2.impl.ContextBase;

import com.jadecove.chain.sample.SellVehicleContext;

/**
 * This revisits example code demonstrating use of the <b>Apache Commons Commons-Chains</b> framework, first 
 * published in  March 2005 on the O'Reilly OnJava site http://www.onjava.com/pub/a/onjava/2005/03/02/commonchains.html. 
 * In this instance, the sample is implemented using commons-chain2.
 */
public class OReillyOnJavaSampleAppPart1Page2WithCatalog {
	
	public static void main(String[] args) {

        try {
				URL url = OReillyOnJavaSampleAppPart1Page2WithCatalog.class.getResource("/chain-config.xml");
				
				ConfigParser parser = new ConfigParser();
				parser.parse(url);
				CatalogFactory<String, Object, ContextBase> catalogFactory = CatalogFactoryBase.getInstance();
				Catalog<String, Object, ContextBase> catalog = catalogFactory.getCatalog();		
				catalog.getCommand("sell-vehicle").execute(new SellVehicleContext());
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}