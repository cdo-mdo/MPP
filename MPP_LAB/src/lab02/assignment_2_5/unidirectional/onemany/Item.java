package lab02.assignment_2_5.unidirectional.onemany;

public class Item {
	String name;

	public Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
