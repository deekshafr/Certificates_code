package Request;

import java.util.List;

public class Orderreq {
    private List<OrderItem> orders;

    public Orderreq(String country, String productOrderedId) {
        this.orders = List.of(new OrderItem(country, productOrderedId));
    }
    public List<OrderItem> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Orderreq{" +
                "orders=" + orders +
                '}';
    }}
class  OrderItem {
    private String country;
    private String productOrderedId;

    public OrderItem(String country, String productOrderedId) {
        this.country = country;
        this.productOrderedId = productOrderedId;
    }
    @Override
    public String toString() {
        return "OrderItem{" +
                "country='" + country + '\'' +
                ", productOrderedId='" + productOrderedId + '\'' +
                '}';
    }
}
