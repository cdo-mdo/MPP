package lab03.assignment_3_4;

public class Driver {

	public static void main(String[] args) {

		Properties[] properties = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);
	}
}
