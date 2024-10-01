package lab02.assignment_2_5.unidirectional.onemany.extpackage;

import java.time.LocalDate;

import lab02.assignment_2_5.unidirectional.onemany.Customer;
import lab02.assignment_2_5.unidirectional.onemany.*;

public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		Order order = cust.addOrder(LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");
		order = cust.addOrder(LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");
		System.out.println(cust.getOrders());
		// cannot directly create an Order here
	}
}