package edu.neu.csye6200;
import java.util.ArrayList;

//ExplosionModel derived from AbstractExplosionModel

public class ExplosionModel extends AbstractExplosionModel {

	//ExplosionList - array initialized to store explosion objects.
	private ArrayList<Explosion> ExplosionList = new ArrayList<Explosion>();
	
	//Adding explosion objects.
	@Override
	public void add(Explosion e){
		// TODO Auto-generated method stub
		this.ExplosionList.add(e);
	}

	@Override
	public void explode() {
		// TODO Auto-generated method stub
		System.out.println("Exploding "+ExplosionList.size()+" explosions now!!!");
        for (Explosion e : ExplosionList) {
        	e.explode();
        }
	}
	/*This Model explodes the Explosion Objects.
	 * It adds explosion objects from parent(Explosion.java) and derived classes.
	 * Derived classes include - Bomb.java, Nuclear.java and Firecrack.java.
	 */
	
	/* Console Output of ExplosionModel:
	ExplosionModel.demo()...

	Exploding 3 explosions now!!!
	Bomb Explosion -- **EXPLODE**!!!
	Firecrack Explosion -- **EXPLODE**!!!
	Nuclear Explosion -- **EXPLODE**!!!

	ExplosionModel.demo()...done!!!

	*/
	public static void demo() {
	  System.out.println("\nExplosionModel.demo()...\n");
      
      ExplosionModel obj = new ExplosionModel(); //Instantiating ExplosionModel object.
      
      //Adding Explosion objects to the ExplosionModel.
      obj.add(new Bomb());         //Executing Dynamic Run-Time Polymorphism.
      obj.add(new Firecrack());
      obj.add(new Nuclear());
      
      obj.explode(); // Explode all the explosions.
      System.out.println("\nExplosionModel.demo()...done!!!\n");
	}

}