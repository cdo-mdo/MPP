package lab05.assignment_5_2;

public class RubberDuck extends Duck {
	public RubberDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new Squeak();
	}
}
