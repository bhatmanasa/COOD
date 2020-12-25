package edu.neu.csye6200;
import java.util.ArrayList;

//ExplodableModel derived from AbstractExplodableModel

public class ExplodableModel extends AbstractExplodableModel {
	
	//AbstractExplodableList - array initialized to store explosion objects.
	private ArrayList<ExplodableAPI> AbstractExplodableList = new ArrayList<ExplodableAPI>();

	//Adding abstract explodable objects.
	@Override
	public void add(ExplodableAPI e) {
		
		this.AbstractExplodableList.add(e);

	}

	@Override
	public void explode() {
		// TODO Auto-generated method stub
		System.out.println("Exploding "+AbstractExplodableList.size()+" Explodable API explosions now!!!");
        for (ExplodableAPI e : AbstractExplodableList) {
        	e.explode();
        }
	}
	/*This Model explodes the Explosion Objects.
	 * It adds explosion objects from parent(Explosion.java) and derived classes.
	 * Derived classes include - BombExplodableAPI.java, NuclearExplodableAPI.java and FirecrackExplodableAPI.java.
	 */
	
	
/* Console output of ExplodableModel:
*ExplodableModel.demo()...
*
*Exploding 3 Explodable API explosions now!!!
*Bomb Explodable API -- **EXPLODE**!!!
*Firecrack Explodable API -- **EXPLODE**!!!
*Nuclear Explodable API -- **EXPLODE**!!!
*
*ExplodableModel.demo() ...done!
*/
	
	public static void demo() {
	      System.out.println("\nExplodableModel.demo()...\n");
	      
	      ExplodableModel objE = new ExplodableModel(); //Instantiating ExplodablenModel(Parent) object.
	      
	      //Adding Explodable objects.
	      objE.add(new BombExplodableAPI());  //Executing Dynamic Run-Time Polymorphism.
	      objE.add(new FirecrackExplodableAPI());
	      objE.add(new NuclearExplodableAPI());
	      
	      objE.explode(); // Explode all the explosions.
	      System.out.println("\nExplodableModel.demo() ...done!\n");
		}

}
