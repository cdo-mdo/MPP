package lesson07.lecture.enums2;

public enum Dim {
	LENGTH(1.0), WIDTH(2.0);

	private double val;

	private Dim(double val) {
		this.val = val;
	}

	public double val() {
		return this.val;
	}
}
