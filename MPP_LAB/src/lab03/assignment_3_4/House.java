package lab03.assignment_3_4;

public class House extends Properties {
	private double lotSize;
	
	public House(double lotSize) {
		super();
		this.lotSize = lotSize;
	}
	
	public House(Address address, double lotSize) {
		super(address);
		this.lotSize = lotSize;
	}
	
	@Override
	public double computeRent() {
		rent = 0.1 * lotSize;
		return rent;
	}
}
