package edu.neu.csye6200;

public class BombExplodableAPIFactory extends ExplodableAPIFactory{

	@Override
	public ExplodableAPI getObjects() {
		return new BombExplodableAPI();
	}
	

}
