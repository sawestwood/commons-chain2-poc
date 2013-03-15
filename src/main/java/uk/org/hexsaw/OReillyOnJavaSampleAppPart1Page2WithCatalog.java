package uk.org.hexsaw;

import java.net.URL;

import org.apache.commons.chain2.Catalog;
import org.apache.commons.chain2.CatalogFactory;
import org.apache.commons.chain2.Context;
import org.apache.commons.chain2.config.ConfigParser;
import org.apache.commons.chain2.impl.CatalogFactoryBase;
import org.apache.commons.chain2.impl.ChainBase;
import org.apache.commons.chain2.impl.ContextBase;

import com.jadecove.chain.sample.SellVehicleContext;

public class OReillyOnJavaSampleAppPart1Page2WithCatalog {
	
	public static void main(String[] args) {
		// THIS DOES NOT WORK YET! WORK IN PROGRESS
        try {
        		// TODO get from classpath
				URL url = OReillyOnJavaSampleAppPart1Page2WithCatalog.class.getResource("/Work/Source/commons-chain2-poc/src/main/resources/chain-config.xml");
				
				ConfigParser parser = new ConfigParser();
				parser.parse(url);
				/*
				CatalogFactory<String, Object, Context<String, Object>> catalogFactory = CatalogFactoryBase.getInstance();
				Catalog catalog = catalogFactory.getCatalog();		
				catalog.getCommand("sell-vehicle");
				ContextBase ctx = new SellVehicleContext();
				((ChainBase<String, Object, ContextBase>) catalog).execute(ctx);
				*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}