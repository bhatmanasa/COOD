package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
	
		ExplosionModel.demo();
		
		ExplosionModelA.demo();      
        
        ExplodableModel.demo();
	}

}
/* Console output of Driver call :
ExplosionModel.demo()...

Exploding 3 explosions using Factory Design now!!!
Bomb Explosion -- **EXPLODE**!!!
Firecrack Explosion -- **EXPLODE**!!!
Nuclear Explosion -- **EXPLODE**!!!

ExplosionModel.demo()...done!!!


ExplosionModelA.demo()...

Exploding 3 Abstract explosions using factory design method now!!!
Bomb AbstractExplosion -- **EXPLODE**!!!
Firecrack AbstractExplosion -- **EXPLODE**!!!
Nuclear AbstractExplosion -- **EXPLODE**!!!

ExplosionModelA.demo()...done!!!


ExplodableModel.demo()...

Exploding 3 Explodable API explosions using factory method now!!!
Bomb Explodable API -- **EXPLODE**!!!
Firecrack Explodable API -- **EXPLODE**!!!
Nuclear Explodable API -- **EXPLODE**!!!

ExplodableModel.demo() ...done!



*/
