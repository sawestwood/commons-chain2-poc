package org.dotkam.samples.chain;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations={ "/spring-chain-config.xml"} )
public class ChainRunnerTest {
	
	@Resource
	ChainRunner chainRunner;
 
	@Test
	public void driveTheChain() {
		System.out.println("Starting up...      [Ok]");
		chainRunner.runChain( "pingPongChain" );
		System.out.println("Finised...          [Ok]");
	}

}
