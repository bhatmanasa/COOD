package edu.neu.csye6200;

public class NuclearExplodableAPIFactory extends ExplodableAPIFactory{

	@Override
	public ExplodableAPI getObjects() {
		return new NuclearExplodableAPI();
	}

}
