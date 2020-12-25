package edu.neu.csye6200;

public class FirecrackExplodableAPIFactory extends ExplodableAPIFactory{

	@Override
	public ExplodableAPI getObjects() {
		return new FirecrackExplodableAPI();
	}

}
