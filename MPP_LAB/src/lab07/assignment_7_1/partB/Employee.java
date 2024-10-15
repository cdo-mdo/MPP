package lab07.assignment_7_1.partB;

public class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}

	public boolean equals(Employee e) {
//		System.out.println("called when remove duplicate");
		return e.name.equals(name) && e.salary == salary;
	}
	
//	@Override // !!!
//	public int hashCode() {
//		int sum = 0;
//		for (int i = 0; i < name.length(); ++i) {
//			sum += name.charAt(i);
//		}
//		sum += salary;
//		return sum;
//	}
	
//	@Override // !!!
//	public boolean equals(Object ob) {
//		if (ob == null) {
//			return false;
//		}
//		if (!(ob instanceof Employee)) {
//			return false;
//		}
//		Employee emp = (Employee) ob;
//		return emp.name.equals(name) && emp.salary == salary;
//	}

}
