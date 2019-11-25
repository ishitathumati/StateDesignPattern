package assignments.StateDesignPattern;
/**
 * This class defines a package and sets 3 states for the package
 * private variables of the class are accessed through getters and setters
 * @author ishitathumati
 *
 */
public class Package {
	private State orderedState;
	private State deliveredState;
	private State inTransitState;
	
	private State state;
	String name="";
	/**
	 * constructor initializes the package with contents and sets states
	 * @param contents
	 */
	public Package(String contents) {
		orderedState = new OrderedState(this);
		deliveredState = new DeliveredState(this);
		inTransitState = new InTransitState(this);
		this.name = contents;
	}
	
	public void order() {
		state=orderedState;
		state.displayStatus();
		state.displayETA();
	}
	
	public void mail() {
		state=inTransitState;
		state.displayStatus();
		state.displayETA();
	}
	
	public void received() {
		state=deliveredState;
		state.displayStatus();
		state.displayETA();
	}
	
	public void setState(State state) {
		this.state=state;
	}
	
	public String getName() {
		return name;
	}
	
	public State getOrderedState() {
		return orderedState;
	}
	
	public State getInTransitState() {
		return inTransitState;
	}
	
	public State getDeliveredState() {
		return deliveredState;
	}
}
