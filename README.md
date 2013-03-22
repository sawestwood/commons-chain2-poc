commons-chain2-poc
==================

This collection of samples references a snapshot version of **commons-chain2**, a revised implementation of 
the commons-chains GoF **Chain of Responsibility** pattern from the Apache Software Foundation (see http://commons.apache.org/proper/commons-chain/). 
The revised version of commons-chain2 is now available in the Apache SVN trunk at http://svn.apache.org/repos/asf/commons/proper/chain/trunk/. 

OnJava ( March 2005)
--------------------
In the first instance, this repository revisits a 2-part example of commons-chains from March 2005  published via 
the O'Reilly OnJava site (http://www.onjava.com/pub/a/onjava/2005/03/02/commonchains.html). Here, the samples illustrated
are reimplemented using commons-chain2. 

To run the samples:

* Part 1 Page 1- The sample on http://www.onjava.com/pub/a/onjava/2005/03/02/commonchains.html can be run using **OReillyOnJavaSampleAppPart1Page1.java**

* Part 1 Page 2- Use **OReillyOnJavaSampleAppPart1Page2.java**

* Part 1 Page 2 using a Catalog XML file - Execute using **OReillyOnJavaSampleAppPart1Page2WithCatalog.java**

Note that the output from all these samples will be the same! They merely use different approaches to process identified commands.

Thus from Maven, to run the first sample use:

	mvn compile exec:java -Dexec.mainClass="uk.org.hexsaw.OReillyOnJavaSampleAppPart1Page1" -Dexec.args="%classpath"
	
Kam - one of those blogs ( July 2009)
-------------------------------------
The blog entry http://www.dotkam.com/2009/07/26/apache-chain-with-spring/ provides a simple example of commons-chains used with Spring. As with 
the first example, the code has been copied as-is and revised to accommodate commons-chain2. This sample bootstraps Spring, loads a simple 
ApplicationContent in which the command beans are created. The sample is exercised via a single test, so to run this, use:

	mvn clean test