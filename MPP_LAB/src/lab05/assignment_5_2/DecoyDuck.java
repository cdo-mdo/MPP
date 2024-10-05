package lab05.assignment_5_2;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new MuteQuack();
	}
}
