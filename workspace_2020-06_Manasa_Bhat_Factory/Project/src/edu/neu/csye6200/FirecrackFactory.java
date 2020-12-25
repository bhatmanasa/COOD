package edu.neu.csye6200;

public class FirecrackFactory extends ExplosionFactory {

	@Override
	public Explosion getObjects() {
		return new Firecrack();
	}

}
