package lesson07.lecture.singletons;

public enum MySingleton {
	INSTANCE;
	
	public void behavior() {
		System.out.println("hello");
	}
}
