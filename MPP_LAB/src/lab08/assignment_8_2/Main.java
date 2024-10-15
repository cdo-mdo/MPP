package lab08.assignment_8_2;

public class Main {
//	public static void main(String[] args) {
//		Supplier<Double> random = () -> Math.random() * 100;
//		
//		System.out.println(random.random());
//			
//	}
	
	public static void main(String[] args) {
		Supplier<Double> (Double d) -> Math.random() * 100;
//		Supplier<Double> random = () -> Math::random() * 100;
		
		System.out.println(random.random());
//		System.out.println(Supplier::random());
			
	}
}
