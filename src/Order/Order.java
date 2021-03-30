package Order;

import Others.Payment;
import People.Client;
import People.Driver;
import Restaurant.*;

import java.util.*;

public class Order {


    private static int inc=0;
    private int orderId;
    private Restaurant restaurant;
    private Client client;
    private Driver driver;
    private List<Map<Product,Integer>> products= new ArrayList<>();
    private Date orderDate;
    private Payment payment;

    public Order(Restaurant restaurant, Client client, Driver driver, Date orderDate,Payment payment){
        this.restaurant = restaurant;
        this.client = client;
        this.driver = driver;
        this.orderDate=orderDate;
        this.payment = payment;
    }

    {
        inc++;
        this.orderId=inc;
    }

    public int getOrderId() {
        return orderId;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Map<Product, Integer>> getProducts() {
        return products;
    }

    public void setProducts(List<Map<Product, Integer>> products) {
        this.products = products;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }



    @Override
    public String toString() {
        return "Order.Order{" +
                "orderId=" + orderId +
                ", restaurant=" + restaurant.getName() +
                ", client=" + client.getFirstName()+client.getLastName() +
                ", driver=" + driver.getFirstName()+driver.getLastName() +
                ", orderDate='" + orderDate + '\'' +
                ", payment=" + payment.getCardNumber()+payment.getCardholder() +
                '}';
    }
}
