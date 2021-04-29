import Others.Location;
import People.Client;
import People.Driver;
import Restaurant.Restaurant;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToCSV {

    public static final String dirPath="writings/";

    public void writeRestaurant(Restaurant restaurant, String fileToWrite) throws IOException {
        File csvFile = new File(dirPath+fileToWrite);

        if (!Files.exists(Paths.get(dirPath))) {
            try {
                Files.createDirectories(Paths.get(dirPath));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            BufferedWriter bwriter = new BufferedWriter(new FileWriter(csvFile));
            String fields="ID"+","+"NAME"+","+"STARS"+","+"CITY"+","+"STREETNAME";
            bwriter.write(fields+"\n");

            String content=restaurant.getRestaurantId()+","+
                    restaurant.getName()+","+
                    restaurant.getStars()+","+
                    restaurant.getLocation().getCity()+","+
                    restaurant.getLocation().getStreetName();
            bwriter.write(content+"\n");
            bwriter.flush();
            bwriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeClient(Client client, String fileToWrite){
        File csvFile = new File(dirPath+fileToWrite);

        if (!Files.exists(Paths.get(dirPath))) {
            try {
                Files.createDirectories(Paths.get(dirPath));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            BufferedWriter bwriter = new BufferedWriter(new FileWriter(csvFile));
            String fields="ID"+","+"FIRST_NAME"+","+"LAST_NAME"+","+"FIDELITY"+","+"CITY"+","+"STREET_NAME";
            bwriter.write(fields+"\n");

            String content=client.getId()+","+
                    client.getFirstName()+","+
                    client.getLastName()+","+
                    client.getFidelity()+","+
                    client.getLocation().getCity()+","+
                    client.getLocation().getStreetName();
            bwriter.write(content+"\n");
            bwriter.flush();
            bwriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeDriver(Driver driver, String fileToWrite){
        File csvFile = new File(dirPath+fileToWrite);

        if (!Files.exists(Paths.get(dirPath))) {
            try {
                Files.createDirectories(Paths.get(dirPath));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            BufferedWriter bwriter = new BufferedWriter(new FileWriter(csvFile));
            String fields="ID"+","+"FIRST_NAME"+","+"LAST_NAME"+","+"RATING";
            bwriter.write(fields+"\n");
            String content=driver.getId()+","+
                    driver.getFirstName()+","+
                    driver.getLastName()+","+
                    driver.getRating()+",";
            bwriter.write(content+"\n");
            bwriter.flush();
            bwriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeLocation(Location location, String fileToWrite){
        File csvFile = new File(dirPath+fileToWrite);

        if (!Files.exists(Paths.get(dirPath))) {
            try {
                Files.createDirectories(Paths.get(dirPath));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            BufferedWriter bwriter = new BufferedWriter(new FileWriter(csvFile));
            String fields="ID"+","+","+"CITY"+","+"STREET_NAME"+","+"STREET_NUMBER";
            bwriter.write(fields+"\n");

            String content=location.getLocationId()+","+
                    location.getCity()+","+
                    location.getStreetName()+","+
                    location.getStreetNumber();
            bwriter.write(content+"\n");
            bwriter.flush();
            bwriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
