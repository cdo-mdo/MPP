package lab02.assignment_2_2.Prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderNumber;
	List<OrderLine> orderLines;

	public Order(String number) {
		this.orderNumber = number;
		orderLines = new ArrayList<>();
	}

	public void addOderLine() {
		OrderLine orderLine = new OrderLine(this);
		orderLines.add(orderLine);
	}
}
