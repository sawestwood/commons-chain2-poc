package org.dotkam.samples.chain.command;
 
import org.apache.commons.chain2.Command;
import org.apache.commons.chain2.impl.ContextBase;
 
public class PongCommand implements Command<String, Object, ContextBase > {
 
	private String message;
 
	public PongCommand( String message ) {
		this.message = message;
	}
 
	public boolean execute( ContextBase context ) {
		System.out.println( message );
		return false;
	}


}