package lab02.assignment_2_4;

import java.util.*;

public class Student {
	String name;
	List<TranscriptEntry> grades;

	public Transcript getTranscript() {
		return new Transcript(grades, this);

	}

}
