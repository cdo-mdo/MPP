package lesson07.lecture.singletons;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MySingletonLazy lazy = MySingletonLazy.getInstance();
		MySingletonEnum myEnum = MySingletonEnum.INSTANCE;
		MySingleton.INSTANCE.behavior();
	}
}
