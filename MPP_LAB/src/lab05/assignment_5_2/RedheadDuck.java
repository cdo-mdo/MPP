package lab05.assignment_5_2;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
}
