package lab03.assignment_3_4;

public class Trailer extends Properties {
	public Trailer() {
		super();
	}
	
	public Trailer(Address address) {
		super(address);
	}
	
	@Override
	public double computeRent() {
		return 0;
	}
}
