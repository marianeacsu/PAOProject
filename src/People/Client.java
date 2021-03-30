package People;


import Others.Location;

public class Client extends Person {
    private int fidelity;
    Location location;


    public Client(String lastName, String firstName, int age, int fidelity, Location location){
        super(lastName,firstName,age);
        this.fidelity=fidelity;
        this.location=location;
    }


    public void setFidelity(int fidelity){
        this.fidelity=fidelity;
    }

    public int getFidelity(){
        return fidelity;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
