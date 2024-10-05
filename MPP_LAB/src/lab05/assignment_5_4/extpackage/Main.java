package lab05.assignment_5_4.extpackage;

import java.util.ArrayList;
import java.util.List;

import lab05.assignment_5_4.CustOrderFactory;
import lab05.assignment_5_4.Customer;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Bob");

		List<String> items1 = new ArrayList<>();
		items1.add("Shirt");
		items1.add("Laptop");
		CustOrderFactory.createOder(cust, items1);

		List<String> items2 = new ArrayList<>();
		items2.add("Pants");
		items2.add("Knife set");
		CustOrderFactory.createOder(cust, items2);

		System.out.println(cust.getOrders());
	}
}
