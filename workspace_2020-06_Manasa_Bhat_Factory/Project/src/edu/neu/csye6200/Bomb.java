package edu.neu.csye6200;
//Child implementation of Parent Explosion method
public class Bomb extends Explosion {
	//Child implementation of Parent Explode method
	@Override
	public void explode() {
		System.out.println("Bomb Explosion -- **EXPLODE**!!!");
	}

}
