package lab03.assignment_3_4;

public class Condo extends Properties {
	private int numFloors;
	
	public Condo(int numFloors) {
		super();
		this.numFloors = numFloors;
	}
	
	public Condo(Address address, int numFloors) {
		super(address);
		this.numFloors = numFloors;
	}
	
	@Override
	public double computeRent() {
		rent = 400 * numFloors;
		return rent;
	}
}
