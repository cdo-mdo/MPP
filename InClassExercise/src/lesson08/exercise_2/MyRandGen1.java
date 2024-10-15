package lesson08.exercise_2;

public class MyRandGen1 {

	public static void main(String[] args) {
		MyIface mrg = new MyIface() {
			@Override
			public int produce() {
				return (int)(Math.random() * 100);
			}			
		};
		System.out.println(mrg.produce());
	}

}
