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
