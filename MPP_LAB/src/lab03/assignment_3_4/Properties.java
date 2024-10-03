package lab03.assignment_3_4;

public abstract class Properties {
	protected double rent;
	protected Address address;

	protected Properties() {
		
	}
	
	protected Properties(Address address) {
		this.address = address;
	}
	
	public abstract double computeRent();
}
