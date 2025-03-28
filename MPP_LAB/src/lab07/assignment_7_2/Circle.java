package lab07.assignment_7_2;

public final class Circle implements ClosedCurve {
	final private double radius;

	@Override
	public double computePerimeter() {
		return 2 * Math.PI * radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
}
