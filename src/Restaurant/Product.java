package Restaurant;

public class Product implements Comparable<Product>{


    private String name;
    private int price;
    private String[] ingredients;
    private String[] allergens;


    public Product(String name, int price, String[] ingredients, String[] allergens) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.allergens = allergens;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getAllergens() {
        return allergens;
    }

    public void setAllergens(String[] allergens) {
        this.allergens = allergens;
    }


    //used to sort products by price
    @Override
    public int compareTo(Product o) {
        return this.price-o.price;
    }
}
