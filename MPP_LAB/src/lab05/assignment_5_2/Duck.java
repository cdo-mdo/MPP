package lab05.assignment_5_2;

public class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void quack() {
		if (quackBehavior != null) { 
			quackBehavior.quack();
		}
		else {
			System.out.println("	not sure how to quack");
		}
	}
	
	public void swim() {
		System.out.println("	swimming");
	}
	
	public void display() {
		System.out.println("	displaying");
	}
	
	public void fly() {
		if (flyBehavior != null) {
			flyBehavior.fly();
		}
		else {
			System.out.println("	not sure how to fly");
		}
	}
	
}
