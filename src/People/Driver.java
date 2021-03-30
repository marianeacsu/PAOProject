package People;

public class Driver extends Person {

    private int rating;

    public Driver(String lastName, String firstName, int age, int rating){
        super(lastName,firstName,age);
        this.rating=rating;
    }



    public void setRating(int rating){
        this.rating=rating;
    }

    public int getRating(){
        return rating;
    }


}
