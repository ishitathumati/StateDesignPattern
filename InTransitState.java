package assignments.StateDesignPattern;
/**
 * This class defines the in transit state
 * displays a different status and ETA
 * @author ishitathumati
 *
 */
public class InTransitState implements State {
	private Package pkg;
	
	public InTransitState(Package pkg) {
		this.pkg=pkg;
	}
	
	public void displayStatus() {
		System.out.println(pkg.getName()+" is out for delivery.");
	}
	
	public void displayETA() {
		System.out.println(pkg.getName()+" should arrive within 5 days.");
	}
}
