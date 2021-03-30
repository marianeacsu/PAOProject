import Order.*;
import Others.Location;
import Others.Payment;
import People.Client;
import People.Driver;
import Restaurant.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {
        String NOWString = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
        Date dateNow=new Date();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date   date1       = format.parse ( "2021-03-12 12-32-11" );
        Date   date2       = format.parse ( "2021-03-13 14-55-33" );

        Service service=new Service();

        Location location1=new Location("Dorobanti",23,"Bucuresti",3);
        Location location2=new Location("Stefan cel Mare",2,"Vaslui");
        Location location3=new Location("Smirdan",182,"Vaslui");

        Product product1=new Product("pizza",39, new String[]{"aluat", "mozzarela", "sunca"}, new String[]{"lactoza"});
        Product product2=new Product("burger",33,new String[]{"chifla", "carne de vita","cartofi prajiti"}, new String[]{"lactate"});
        Product product3=new Product("paste carbonara",38,new String[]{"paste","carne de vita","sos de rosii"},new String[]{"lactoza"});
        Product product4=new Product("salata caesar",30,new String[]{"piept de pui","salata verde","parmesan","rosii"},new String[]{"lactoza"});

        List<Product> productsList1=new ArrayList<>();
        List<Product> productsList2=new ArrayList<>();
        productsList1.add(product1);
        productsList1.add(product2);
        productsList2.add(product3);
        productsList2.add(product4);
        Collections.sort(productsList1);
        Collections.sort(productsList2);

        Menu menu1=new Menu(productsList1);
        Restaurant restaurant1=new Restaurant("B4 market",4,menu1,location1);

        Menu menu2=new Menu(productsList2);
        Restaurant restaurant2=new Restaurant("Vecchia Roma",5,menu2,location2);

        Driver driver1=new Driver("Grama","Eusebiu",22,5);
        Driver driver2=new Driver("Popa","Marian",30,3);

        Client client1=new Client("Ion", "Popescu",23,2,location3);
        Client client2=new Client("Ionita", "Laura", 43,1,location3);


        Payment payment1=new Payment("4140 4535 5451 4346", dateNow,"666","ionita laura");
        Payment payment2=new Payment("4140 6754 4535 5215", dateNow,"557","Ioan Popescu");


        System.out.println("Meniul restaurantului "+ restaurant1.getName());
        service.printRestaurantMenu(restaurant1);

        Order order1=new Order(restaurant1,client1,driver1,date1,payment1);
        service.addProduct(order1,product1,2);
        System.out.println("S-a adaugat la comanda produsul "+ product1.getName());
        service.addProduct(order1,product2,4);
        System.out.println("S-a adaugat la comanda produsul "+ product2.getName());

        System.out.println("produsele din comanda cu id " + order1.getOrderId()+ " sunt: ");
        for(String prod:service.getProductsNameFromOrder(order1)){
            System.out.println("    " + prod);
        }

        System.out.println("Total de plata pentru comanda cu id "+ order1.getOrderId()+ " este "+ service.getTotalPrice(order1));
        System.out.println("Total de plata dupa aplicarea discontului in functie de fidelitatea clientului: "+ service.applyDiscount(order1));

        //error message bc the product doesn't exists in the menu
        //service.addProduct(order1,product3,3);
        System.out.println("\n**********************************************\n");
        System.out.println("Meniul restaurantului "+ restaurant2.getName());
        service.printRestaurantMenu(restaurant2);

        Order order2=new Order(restaurant2,client2,driver2,date2,payment2);
        service.addProduct(order2,product3,2);
        System.out.println("S-a adaugat la comanda produsul "+ product3.getName());
        service.addProduct(order2,product4,6);
        System.out.println("S-a adaugat la comanda produsul "+ product4.getName());

        System.out.println("produsele din comanda cu id " + order2.getOrderId()+ " sunt: ");
        for(String prod:service.getProductsNameFromOrder(order2)){
            System.out.println("    " + prod);
        }
        System.out.println("Total de plata pentru comanda cu id "+ order2.getOrderId()+ " este "+ service.getTotalPrice(order2));
        System.out.println("Total de plata dupa aplicarea discontului in functie de fidelitatea clientului: "+ service.applyDiscount(order2));
        System.out.println("\n**********************************************\n");

        //create lists of restaurants
        List<Restaurant> restaurants=new ArrayList<>();
        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        System.out.println("\nRestaurantele care se afla in orasul specificat sunt: ");
        service.getAllRestaurantsFromCity("Vaslui",restaurants);

        //search for specific dish
        System.out.println("\nRestaurantele care au felul de mancare dorit sunt: ");
        service.getAllRestaurantsWithSpecificDish("pizza",restaurants);

        //create a list of all arders
        List<Order> orders=new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        System.out.println("\nComenzile clientului specificat sunt:");
        service.getAllClientsOrders(client1,orders);

        System.out.println("\nComenzile plasate in ziua specificata sunt:");
        service.getOrdersOfSpecificDay("2021-03-12",orders);

        System.out.println("\nComenzile primite de restaurantul specificat sunt:");
        service.getOrdersofSpecificRestaurant(restaurant1,orders);


    }
}

