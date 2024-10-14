package lesson07.exercise_1;

public interface StringList {
		
//	public String[] strArray = null;
//	public int size = 0;
	
	String[] strArray();
	int size();
	void incrementSize();
	
	/** Adds a string to the end of the list */
	default void add(String s) {
//		strArray[size()] = s;
		strArray()[size()] = s;
		incrementSize();
	}
	
	/** Gets the i_th string in the list */
	public String get(int i);
	
}
