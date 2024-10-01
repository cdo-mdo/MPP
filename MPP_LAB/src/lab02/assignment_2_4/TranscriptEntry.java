package lab02.assignment_2_4;

class TranscriptEntry {
	Student student;
	Section section;
	String grade;

	public String toString() {
		return "Student: " + student.name + "\n" + "Course name: " + section.courseName + "\n" + "Section number: "
				+ section.sectionNumber + "\n" + "Grade: " + grade + "\n";
	}
}
