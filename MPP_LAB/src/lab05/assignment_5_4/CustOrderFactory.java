package lab05.assignment_5_4;

import java.time.LocalDate;
import java.util.List;

final public class CustOrderFactory {
	private CustOrderFactory() {
		
	}
	
	public static Customer createCustomer(String name) {
		Customer cust = new Customer(name);
		return cust;
	}

	public static void createOder(Customer customer, List<String> names) {
		Order order = Order.newOrder(customer, LocalDate.now());
		for (String name: names) {
			order.addItem(name);
		}
	}
}
