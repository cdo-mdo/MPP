package lab03.assignment_3_3;

public class Apartment {
	private double rent;
	private Building building;
	
	public double getRent() {
		return rent;
	}

	Apartment(double rent) {
		this.rent = rent;
	};
	
	Apartment(double rent, Building building) {
		this.rent = rent;
		this.building = building;
	}
}
