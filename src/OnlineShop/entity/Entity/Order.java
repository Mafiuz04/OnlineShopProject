package OnlineShop.entity.Entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    private Customer customer;
    private Cart cart;
    private double orderPrice;
    private LocalDateTime orderDateTime;

    public Order(Customer user, Cart cart, LocalDateTime orderDateTime) {
        this.customer = user;
        this.cart = cart;
        this.orderPrice = cart.getTotalPrice();
        this.orderDateTime = LocalDateTime.now();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderDateTime() {
        return orderDateTime.format(DateTimeFormatter.ISO_WEEK_DATE);
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + customer +
                ", cart=" + cart +
                ", orderPrice=" + orderPrice +
                ", orderDateTime=" + orderDateTime +
                '}';
    }
}
