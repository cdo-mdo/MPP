package lab09.assignment_9_2;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String street;
    private String city;
    private String zip;
    private String email;
    private List<Order> orders;
    
    String getEmail() {
        return this.email;
    }
    
    List<Order> getOrder() {
        return this.orders;
    }
    
    public Customer(String name, String street, String city, String zip, String email) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.email = email;
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString() {
        return name + " " + street + " " + city + " " + zip;
    }
}
