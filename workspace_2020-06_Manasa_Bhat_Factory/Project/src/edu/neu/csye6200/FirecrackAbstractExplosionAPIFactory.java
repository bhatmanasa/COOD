package edu.neu.csye6200;

public class FirecrackAbstractExplosionAPIFactory extends AbstractExplosionAPIFactory{

	@Override
	public AbstractExplosionAPI getObjects() {
		return new FirecrackAbstractExplosionAPI();
	}

}
