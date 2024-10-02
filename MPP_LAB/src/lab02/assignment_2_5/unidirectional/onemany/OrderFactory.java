package lab02.assignment_2_5.unidirectional.onemany;

import java.time.LocalDate;

public class OrderFactory {
	public static Customer createCustomer(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Customer name cannot be null");
		}
		Customer cust = new Customer(name);
		Order order = cust.addOrder(LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");
		order = cust.addOrder(LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");
		
		return cust;
	}
	
}
