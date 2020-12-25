package edu.neu.csye6200;

public class NuclearFactory extends ExplosionFactory {

	@Override
	public Explosion getObjects() {
		return new Nuclear();
	}

}
