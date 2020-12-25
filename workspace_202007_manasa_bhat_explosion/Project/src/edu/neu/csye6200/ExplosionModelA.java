package edu.neu.csye6200;
import java.util.ArrayList;

//ExplosionModelA derived from AbstractExplosionModelA

public class ExplosionModelA extends AbstractExplosionModelA {
	//AbstractExplosionList - array initialized to store explosion objects.
	private ArrayList<AbstractExplosionAPI> AbstractExplosionList = new ArrayList<AbstractExplosionAPI>();
	
	//Adding explosion objects.
	@Override
	public void add(AbstractExplosionAPI e){
		this.AbstractExplosionList.add(e);
	};
	
	/**
	 * Explode all 
	 */
	@Override
	public void explode() {
		// TODO Auto-generated method stub
		System.out.println("Exploding "+AbstractExplosionList.size()+" Abstract explosions now!!!");
        for (AbstractExplosionAPI e : AbstractExplosionList) {
        	e.explode();
        }
	}
	
	/*This Model explodes the AbstractExplosion Objects.
	 * It adds explosion objects from parent(AbstractExplosion.java) and derived classes.
	 * Derived classes include - BombAbstractExplosionAPI.java, NuclearAbstractExplosionAPI.java and FirecrackAbstractExplosionAPI.java.
	 */
	
	/* Console Output of ExplosionModelA:		
	*ExplosionModelA.demo()...
    *
	*Exploding 3 Abstract explosions now!!!
	*Bomb AbstractExplosion -- **EXPLODE**!!!
	*Firecrack AbstractExplosion -- **EXPLODE**!!!
	*Nuclear AbstractExplosion -- **EXPLODE**!!!
    *
	*ExplosionModelA.demo()...done!!!
	*/
	public static void demo() {
	      System.out.println("\nExplosionModelA.demo()...\n");
	      
	      ExplosionModelA objA = new ExplosionModelA(); //Instantiating ExplosionModelA object.
	      
	      //Adding Abstract Explosion objects to the AbstractExplosionModel.
	      
	      objA.add(new BombAbstractExplosionAPI());  //Executing Dynamic Run-Time Polymorphism.
	      objA.add(new FirecrackAbstractExplosionAPI());
	      objA.add(new NuclearAbstractExplosionAPI());
	      
	      objA.explode(); // Explode all the explosions.
	      System.out.println("\nExplosionModelA.demo()...done!!!\n");
		}
}
