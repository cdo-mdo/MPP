package lab02.assignment_2_5.unidirectional.onemany.extpackage;

import lab02.assignment_2_5.unidirectional.onemany.Customer;
import lab02.assignment_2_5.unidirectional.onemany.*;

public class Main {
	public static void main(String[] args) {
		Customer cust = OrderFactory.createCustomer("Bob");	
		
		System.out.println(cust.getOrders());
	}
}
