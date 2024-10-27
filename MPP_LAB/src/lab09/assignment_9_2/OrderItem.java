package lab09.assignment_9_2;

import java.time.LocalDate;

public class OrderItem {
    public String productId;
    public int quantityRequested;
    public int unitPrice;
    
    public int getUnitPrice() {
        return unitPrice;
    }
    
    public String getProductId() {
        return productId;
    }

    // package level constructor
    OrderItem(String id, int quantity, int price) {
        this.productId = id;
        this.quantityRequested = quantity;
        this.unitPrice = price;
    }

    @Override
    public String toString() {
        return "   " + productId + ": " + quantityRequested + ", " + unitPrice;
    }

}
