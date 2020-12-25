package edu.neu.csye6200;

public class BombAbstractExplosionAPIFactory extends AbstractExplosionAPIFactory{

	@Override
	public AbstractExplosionAPI getObjects() {
		return new BombAbstractExplosionAPI();
	}

}
