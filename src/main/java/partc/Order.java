package partc;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Order {
    private Integer id;
    private java.sql.Date orderDate;
    private List<Product> products;
    private List<Integer> quantity;
    private Double totalPrice;
    private Customer customer;

    public Order(Integer id, java.sql.Date orderDate, List<Product> products, List<Integer> quantity, Double totalPrice, Customer customer) {
        this.id = id;
        this.orderDate = orderDate;
        this.products = products;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public java.sql.Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(java.sql.Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<Integer> quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order { " +
                "id = " + id +
                ", orderDate = " + orderDate +
                ", products = " + products +
                ", quantity = " + quantity +
                ", totalPrice = " + totalPrice +
                ", customer = " + customer +
                " } ";
    }
}
