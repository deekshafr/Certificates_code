package Response;

public class orderres {
    private String orders;
    private String productOrderId;
    private  String message;

    public String getProductOrderId() {
        return productOrderId;
    }

    public void setProductOrderId(String productOrderId) {
        this.productOrderId = productOrderId;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "orderres{" +
                "orders='" + orders + '\'' +
                ", productOrderId='" + productOrderId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public orderres(String orders, String productOrderId, String message ) {
        this.orders = orders;
        this.productOrderId=productOrderId;
        this.message=message;
    }

}
