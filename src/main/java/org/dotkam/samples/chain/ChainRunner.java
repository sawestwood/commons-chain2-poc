package org.dotkam.samples.chain;
 
import org.apache.commons.chain2.impl.ChainBase;
import org.apache.commons.chain2.impl.ContextBase;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
 
public class ChainRunner implements BeanFactoryAware {
 
	private BeanFactory beanFactory;
 
	@SuppressWarnings("unchecked")
	public void runChain( String chainName ) {
		try {
			this.createChain ( chainName ).execute( new ContextBase() );
		}
		catch ( Exception exc ) {
			throw new RuntimeException(
					"Chain \"" + chainName + "\": Execution failed.", exc );
		}
	}
 
	public void setBeanFactory( BeanFactory beanFactory ) throws BeansException {
		this.beanFactory = beanFactory;
	}
 
	@SuppressWarnings("rawtypes")
	protected ChainBase createChain( String chainName ) {
		return ( ChainBase ) this.beanFactory.getBean( chainName );
	}
}