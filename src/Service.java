import People.Client;
import Restaurant.*;
import Others.*;
import Order.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Service {


    private Product getProductFromMenu(String productName, Menu menu) {
        List<Product> products = menu.getProducts();
        for (Product product : products) {
            if (product.getName() == productName) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Order order, Product product, int quantity) {
        List<Map<Product, Integer>> products = order.getProducts();
        Map<Product, Integer> myOrder = new HashMap<>();

        if (getProductFromMenu(product.getName(), order.getRestaurant().getMenu()) != null) {
            myOrder.put(product, quantity);
            products.add(myOrder);
        } else {
            System.out.println("The product " + product.getName() + " doesn't exists in menu");
        }

    }

    public int getTotalPrice(Order order) {
        List<Map<Product, Integer>> products = order.getProducts();
        int total = 0;
        for (Map<Product, Integer> product : products) {
            for (Map.Entry<Product, Integer> entry : product.entrySet()) {
                total += entry.getKey().getPrice() * entry.getValue();
            }
        }
        return total;
    }

    public List<String> getProductsNameFromOrder(Order order) {
        List<Map<Product, Integer>> products = order.getProducts();
        List<String> names = new ArrayList<>();
        for (Map<Product, Integer> product : products) {
            for (Map.Entry<Product, Integer> entry : product.entrySet()) {
                names.add(entry.getKey().getName());
            }
        }
        return names;
    }


    public void printRestaurantMenu(Restaurant restaurant) {
        List<Product> products = restaurant.getMenu().getProducts();
        for (Product product : products) {
            System.out.println(product.getName() + "   -   " + product.getPrice() + " lei" + "\n     " + "ingredients: " + Arrays.toString(product.getIngredients()) + "   allergens: " + Arrays.toString(product.getAllergens()));
        }

    }

    // apply discount depending on client's fidelity
    public int applyDiscount(Order order) {
        int total = getTotalPrice(order);
        //10% discount for fidelity 1
        if (order.getClient().getFidelity() == 1) {
            return (int) ((total) - 0.1 * total);
        }
        //30% discount for fidelity 2
        else if (order.getClient().getFidelity() == 2) {
            return (int) ((total) - 0.2 * total);
        }
        //30% discount for fidelity 3
        else if (order.getClient().getFidelity() == 3) {
            return (int) ((total) - 0.3 * total);
        } else {
            return total;
        }
    }

    public void getAllRestaurantsFromCity(String city, List<Restaurant> restaurants) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getLocation().getCity().equals(city)) {
                System.out.println(restaurant.toString());
            }
        }
    }

    public void getAllRestaurantsWithSpecificDish(String dishName, List<Restaurant> restaurants) {
        for (Restaurant restaurant : restaurants) {
            for (Product product : restaurant.getMenu().getProducts()) {
                if (product.getName().equals(dishName)) {
                    System.out.println(restaurant.toString());
                }
            }
        }

    }

    public void getAllClientsOrders(Client client, List<Order> orders) {
        for (Order order : orders) {
            if (order.getClient().equals(client)) {
                System.out.println(order.toString());
            }
        }
    }

    public void getOrdersOfSpecificDay(String day, List<Order> orders) {
        for (Order order : orders) {
            String date = new SimpleDateFormat("yyyy-MM-dd").format(order.getOrderDate());
            if (date.equals(day)){
                System.out.println(order.toString());
            }
        }
    }

    public void getOrdersofSpecificRestaurant(Restaurant restaurant, List<Order> orders){
        for (Order order:orders){
            if (order.getRestaurant().equals(restaurant)){
                System.out.println(order.toString());
            }
        }

    }




}