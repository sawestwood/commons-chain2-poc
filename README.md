commons-chain2-poc
==================

This collection of samples references a snapshot version of commons-chain2, a revised implementation of 
commons-chains GoF Chain of Responsibility pattern from the Apache Software Foundation (see http://commons.apache.org/proper/commons-chain/). 
The revised version of commons-chain2 is now available in the Apache SVN trunk at http://svn.apache.org/repos/asf/commons/proper/chain/trunk/. 

In the first instance, this repository revisits a 2-part example of commons-chains from March 2005  published via 
the O'Reilly OnJava site (http://www.onjava.com/pub/a/onjava/2005/03/02/commonchains.html). Here, the samples illustrated
are reimplemented  using a new version of commons-chain. 

In undertaking this work:
1. Original package and class names have been retained where possible (much of the original work was packaged under com.jadecove.chain.sample)
2. However the application classes (i.e. those with a main() method) are located under uk.org.hexsaw)
3. The Java class containing main() are labelled using a combination of part number and page number.
4. commons-chain now assumes JDK6 usage

Therefore, to run the samples:

* Part 1 Page 1- http://www.onjava.com/pub/a/onjava/2005/03/02/commonchains.html can be run using  OReillyOnJavaSampleAppPart1Page1.java

* Part 1 Page 2 - 

Thus from Maven, to run the first sample use

	mvn exec:java -Dexec.mainClass="uk.org.hexsaw.OReillyOnJavaSampleAppPart1Page1"