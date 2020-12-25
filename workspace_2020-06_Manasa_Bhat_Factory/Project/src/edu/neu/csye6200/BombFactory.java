package edu.neu.csye6200;

public class BombFactory extends ExplosionFactory {

	@Override
	public Explosion getObjects() {
		return new Bomb();
	}

}
