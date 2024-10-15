package lab07.assignment_7_4;

public interface CannotFly extends FlyBehavior {
	@Override
	default void fly() {
		 System.out.println("	cannot fly");
	}

}
