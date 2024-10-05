package lab05.assignment_5_2;

public class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void quack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("	swimming");
	}
	
	public void display() {
		System.out.println("	displaying");
	}
	
	public void fly() {
		flyBehavior.fly();
	}
	
}
