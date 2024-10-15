package lab07.assignment_7_4;

public interface MuteQuack extends QuackBehavior {
	@Override
	default void quack() {
		System.out.println("	cannot quack");
	}
}
