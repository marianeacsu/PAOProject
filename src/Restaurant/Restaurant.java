package Restaurant;

import Others.Location;

public class Restaurant {
    private static int inc=0;
    private int restaurantId;
    private String name;
    private int stars;
    private Menu menu;

    Location location;

    public Restaurant(String name, int stars, Menu menu, Location location) {
        this.name = name;
        this.stars = stars;
        this.menu = menu;
        this.location = location;
    }

    {
        inc++;
        this.restaurantId=inc;
    }

    public int getRestaurantId() {
        return restaurantId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", name='" + name + '\'' +
                ", stars=" + stars +
                ", city=" + location.getCity() +
                ", street="+ location.getStreetName() +
                '}';
    }
}
