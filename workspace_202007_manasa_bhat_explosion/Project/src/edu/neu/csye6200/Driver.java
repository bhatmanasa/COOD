package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
	
		
/* Console Output of ExplosionModel:
ExplosionModel.demo()...

Exploding 3 explosions now!!!
Bomb Explosion -- **EXPLODE**!!!
Firecrack Explosion -- **EXPLODE**!!!
Nuclear Explosion -- **EXPLODE**!!!

ExplosionModel.demo()...done!!!

*/
		ExplosionModel.demo();
		
/* Console Output of ExplosionModelA:		
ExplosionModelA.demo()...

Exploding 3 Abstract explosions now!!!
Bomb AbstractExplosion -- **EXPLODE**!!!
Firecrack AbstractExplosion -- **EXPLODE**!!!
Nuclear AbstractExplosion -- **EXPLODE**!!!

ExplosionModelA.demo()...done!!!
*/
		ExplosionModelA.demo();
		
/* Console output of ExplodableModel:
ExplodableModel.demo()...

Exploding 3 Explodable API explosions now!!!
Bomb Explodable API -- **EXPLODE**!!!
Firecrack Explodable API -- **EXPLODE**!!!
Nuclear Explodable API -- **EXPLODE**!!!

ExplodableModel.demo() ...done!
*/
        
        
        ExplodableModel.demo();
	}

}
