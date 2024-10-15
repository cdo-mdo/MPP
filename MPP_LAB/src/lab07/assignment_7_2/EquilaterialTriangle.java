package lab07.assignment_7_2;

public class EquilaterialTriangle implements Polygon {
	double side;

	@Override
	public double[] getSides() {
		double[] sides = {side, side, side};
		return sides;
	}
	
	EquilaterialTriangle(double side) {
		this.side = side;
	}

}
