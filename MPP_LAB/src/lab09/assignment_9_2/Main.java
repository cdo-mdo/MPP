package lab09.assignment_9_2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static List<Order> orders;

    public static void main(String[] args) {
        Main m = new Main();
        m.loadOrderData();
        m.displayAllOrders();
        m.showAllOrderItems();
        
        System.out.println("++++++++++++++++++");
        
        System.out.println(orders.stream()
            .flatMap(o -> o.getOrderItems().stream())
            .sorted(Comparator.comparing((OrderItem i) -> i.unitPrice))
//            .limit(1)
            .toList().get(0).productId);
//            .map(i -> i.productId));
//            .filter(i -> Math.min(i.unitPrice));
                    

        System.out.println("++++++++++++++++++");
        
        Customer customer1 = new Customer("Frank", "street1", "city1", "zip1", "email1");
        Customer customer2 = new Customer("Gajen", "street2", "city2", "zip2", "email2");
        Customer customer3 = new Customer("Roger", "street3", "city3", "zip3", "email3");
        
        Order o = new Order(LocalDate.of(2011, 10, 5), "10-210", "1001", 2, 11);
        o.addOrderItem("1002", 1, 23);
        o.addOrderItem("1003", 1, 45);
        customer1.addOrder(o);
//        customer2.addOrder(o);
        customer3.addOrder(o);

        o = new Order(LocalDate.of(2001, 11, 15), "11-220", "1015", 2, 33);
        o.addOrderItem("1016", 3, 15);
        o.addOrderItem("1017", 1, 22);
        o.addOrderItem("1018", 2, 19);
        o.addOrderItem("1019", 5, 9);
        customer1.addOrder(o);
        customer2.addOrder(o);
        customer3.addOrder(o);

        o = new Order(LocalDate.of(2011, 10, 5), "10-210", "1022", 1, 80);
        o.addOrderItem("1023", 1, 28);
        o.addOrderItem("1024", 1, 41);
        customer1.addOrder(o);
//        customer2.addOrder(o);
        customer3.addOrder(o);
        
        List<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(customer1);
        listCustomer.add(customer2);
        listCustomer.add(customer3);
        
        List<Order> listOrder = LambdaLibrary.ORDERS.apply(listCustomer, "email2");
        listOrder.forEach(System.out::println);
        
        System.out.println("++++++++++++++++++");
        
        System.out.println(LambdaLibrary.NAME_OF_ORDER.apply(listCustomer, "Gajen").getProductId());
//        oderItems.forEach(System.out::println);
        
    }

    // Uses flatMap to write to console a list of all order items
    private void showAllOrderItems() {
        System.out.println("\n==============\nAll order items:");
        // implement
        List<OrderItem> list = orders.stream()
                .flatMap(order -> order.getOrderItems().stream()).toList();
        
        System.out.println(list);    
    }

    private void displayAllOrders() {
        System.out.println(orders);
        ;
    }

    private void loadOrderData() {
        orders = new ArrayList<>();
        Order o = new Order(LocalDate.of(2011, 10, 5), "10-210", "1001", 2, 11);
        o.addOrderItem("1002", 1, 23);
        o.addOrderItem("1003", 1, 45);
        orders.add(o);

        o = new Order(LocalDate.of(2001, 11, 15), "11-220", "1015", 2, 33);
        o.addOrderItem("1016", 3, 15);
        o.addOrderItem("1017", 1, 22);
        o.addOrderItem("1018", 2, 19);
        o.addOrderItem("1019", 5, 9);
        orders.add(o);

        o = new Order(LocalDate.of(2011, 10, 5), "10-210", "1022", 1, 80);
        o.addOrderItem("1023", 1, 28);
        o.addOrderItem("1024", 1, 41);
        orders.add(o);
    }
    

}
