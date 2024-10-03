package lab03.assignment_3_4;

public class Admin {
	public static double computeTotalRent(Properties[] properties) {
		double totalRent = 0;
		for (Properties property: properties) {
			totalRent += property.computeRent();
		}
		return totalRent;
	}
}
