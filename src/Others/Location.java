package Others;

public class Location {

    private static int inc=0;
    private int locationId;
    private String streetName;
    private int streetNumber;
    private String city;
    private int sectorNumber;

    public Location(String streetName, int streetNumber, String city,int sectorNumber){
        this.streetName=streetName;
        this.streetNumber=streetNumber;
        this.city=city;
        this.sectorNumber=sectorNumber;
    }

    public Location(String streetName, int streetNumber, String city){
        this.streetName=streetName;
        this.streetNumber=streetNumber;
        this.city=city;
    }


    {
        inc++;
        this.locationId=inc;
    }

    public int getLocationId(){
        return locationId;
    }


    public String getStreetName() {
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    public int getSectorNumber() {
        return sectorNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSectorNumber(int sectorNumber) {
        this.sectorNumber = sectorNumber;
    }
}
