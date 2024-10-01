package lesson07.lecture.overrideequals.equalclassesstrategy2;
@SuppressWarnings("unused")
public class PersonWithJob extends Person {	
	private double salary;
	public PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}
	
	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new PersonWithJob("Joe", 30000);
		System.out.println("p1.equals(p2)? "+(p1.equals(p2)));
	}

}
