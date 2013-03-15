package uk.org.hexsaw;

import java.net.URL;

import org.apache.commons.chain2.Catalog;
import org.apache.commons.chain2.CatalogFactory;
import org.apache.commons.chain2.config.ConfigParser;
import org.apache.commons.chain2.impl.CatalogFactoryBase;
import org.apache.commons.chain2.impl.ContextBase;

import com.jadecove.chain.sample.SellVehicleContext;

public class OReillyOnJavaSampleAppPart1Page2WithCatalog {
	
	public static void main(String[] args) {

        try {
				URL url = OReillyOnJavaSampleAppPart1Page2WithCatalog.class.getResource("/chain-config.xml");
				
				ConfigParser parser = new ConfigParser();
				parser.parse(url);
				CatalogFactory<String, Object, ContextBase> catalogFactory = CatalogFactoryBase.getInstance();
				Catalog catalog = catalogFactory.getCatalog();		
				catalog.getCommand("sell-vehicle").execute(new SellVehicleContext());
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}