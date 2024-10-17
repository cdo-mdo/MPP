package test05;

public enum Alignment {
	LEFT(1), CENTER(2), RIGHT(3);
	
	private int x;
	
	private Alignment(int i) {
		this.x = i;
	}
	
	public static void main(String[] args) {
		System.out.println(Alignment.LEFT.getSname())
	}
}
