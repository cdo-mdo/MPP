package lab05.assignment_5_4;

public class Item {
	String name;

	Item(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
