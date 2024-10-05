package lab05.assignment_5_2;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("	cannot quack");
	}

}
