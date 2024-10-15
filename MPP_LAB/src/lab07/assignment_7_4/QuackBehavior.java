package lab07.assignment_7_4;

public interface QuackBehavior {
	default void quack() {
		System.out.println("	quack");
	}
}
