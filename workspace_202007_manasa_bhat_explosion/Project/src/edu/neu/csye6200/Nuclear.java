package edu.neu.csye6200;

public class Nuclear extends Explosion {
	
	//Child implementation of Parent Explode method
		@Override
		public void explode() {
			System.out.println("Nuclear Explosion -- **EXPLODE**!!!");
		}

}
