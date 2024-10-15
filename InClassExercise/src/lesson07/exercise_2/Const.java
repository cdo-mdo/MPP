package lesson07.exercise_2;

public enum Const {
	INSTANCE("MIcrosoft", 20000000);
	
	private String company;
	
	private int salesTarget;
	
	private Const(String company, int salesTarget) {
		this.company = company;
		this.salesTarget = salesTarget;
	}
	
	
	
}
