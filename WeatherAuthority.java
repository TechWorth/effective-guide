import java.io.*;
import java.util.*;
import java.util.Random;

public class WeatherAuthority {
    ArrayList<Storm> newStorms;// Array List of storms
    String name = "";// Stores the names of new storm
    private Random random = new Random();

    public WeatherAuthority() {
        newStorms = new ArrayList<Storm>();
        try {
            Scanner scan = new Scanner(new File("Storms.txt"));
            while (scan.hasNextLine()) {// Checking for next name in the file
                newStorms.add(new Storm(scan.nextLine()));// adds name to Storm Construtor
            }
        } catch (Exception e) {

        }

    }

    public String getNextStorm() {

        for (int i = 0; i < newStorms.size(); i++) {// loop through Array list of storms to get names
            Storm randomName = newStorms.get(random.nextInt(newStorms.size()));// ramdomly taken from the Array list

            name = randomName.getName();
        }

        return name;
    }

}