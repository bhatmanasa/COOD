package edu.neu.csye6200;

public class NuclearAbstractExplosionAPIFactory extends AbstractExplosionAPIFactory{

	@Override
	public AbstractExplosionAPI getObjects() {
		return new NuclearAbstractExplosionAPI();
	}

}
