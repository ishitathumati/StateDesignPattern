package assignments.StateDesignPattern;
/**
 * this class defines the delivered state
 * displays a different status and ETA message
 * @author ishitathumati
 *
 */
public class DeliveredState implements State{
	private Package pkg;
	
	public DeliveredState(Package pkg) {
		this.pkg=pkg;
	}
	
	public void displayStatus() {
		System.out.println(pkg.getName()+" is here for you.");
	}
	
	public void displayETA() {
		System.out.println(pkg.getName()+" is here.");
	}
}
