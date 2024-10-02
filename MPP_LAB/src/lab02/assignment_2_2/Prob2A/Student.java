package lab02.assignment_2_2.Prob2A;

public class Student {
	private String name;
	private GradeReport gradeReport;

	public Student(String name) {
		this.name = name;
		this.gradeReport = new GradeReport(this);
	}
}
