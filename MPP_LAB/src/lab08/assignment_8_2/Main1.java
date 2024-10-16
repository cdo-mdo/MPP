package lab08.assignment_8_2;

public class Main1 {
    Random1 random1 = new Random1();
    
    class Random1<T> implements Supplier<T> {

        @Override
        public double random() {
            return Math.random() * 100;
        }
        
    }
    
//	public static void main(String[] args) {
//		Supplier<Double> random = () -> Math.random() * 100;
//		
//		System.out.println(random.random());
//			
//	}
	
	public static void main(String[] args) {
//		Supplier<Double> (Double d) -> Math.random() * 100;
//		Supplier<Double> random = () -> Math::random() * 100;
		
//		System.out.println(random.random());
//		System.out.println(Supplier::random());
	    
	    
	    
	    Random random = new Random();
	    System.out.println(random.random());

	    Main1 main = new Main1();
	    System.out.println(main.random1.random());
	    
	    class Random2<T> implements Supplier {

            @Override
            public double random() {
                return Math.random() * 100;
            }
	        
	    };
	    
	    Random2 random2 = new Random2();
	    System.out.println(random2.random());
	    
	    Supplier random3 = new Supplier() {
	        @Override
	        public double random() {
	            return Math.random() * 100;
	        }
	    };
	    System.out.println(random3.random());
	    
	    Supplier random4 = () -> {
	        return Math.random() * 100;
	    };
	    System.out.println(random4.random());
	}
}
