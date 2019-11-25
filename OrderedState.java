package assignments.StateDesignPattern;
/**
 * This class defines the order state
 * defines the functions in the state interface
 * @author ishitathumati
 *
 */
public class OrderedState implements State {
	private Package pkg;
	
	public OrderedState(Package pkg) {
		this.pkg=pkg;
	}
	
	public void displayStatus() {
		System.out.println(pkg.getName()+" was ordered.");
	}
	
	public void displayETA() {
		System.out.println(pkg.getName()+" should arrive in 5 to 7 business days.");
	}
}
