package lesson08.exercise_2;

public class MyRandGen3 {
	public static void main(String[] args) {
		MyIface mrg = () -> (int) (Math.random() * 100);
		System.out.println(mrg.produce());
		
	}

}
