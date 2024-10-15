package lab07.assignment_7_2;

public class Ellipse implements ClosedCurve {
	double a;
	double E;
	
	Ellipse(double a, double E) {
		this.a = a;
		this.E = E;
	}

	@Override
	public double computePerimeter() {
		return 4 * a * E;
	}
	
	
}
