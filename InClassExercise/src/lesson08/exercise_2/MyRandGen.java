package lesson08.exercise_2;

public class MyRandGen implements MyIface {
	
	@Override
	public int produce() {
		return (int)(Math.random() * 100);
	}
	
	public static void main(String[] args) {
		MyIface mrg = new MyRandGen();
		System.out.println(mrg.produce());
	};

}
