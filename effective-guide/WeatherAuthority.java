import java.io.*;
import java.util.*;

public class WeatherAuthority {
    ArrayList<Storm> storms = new ArrayList<Storm>();
    ArrayList<Storm> usedname = new ArrayList<Storm>();
    String name = "";

    public String getNextStorm() {
        try {
            Scanner scan = new Scanner(new File("Storms.txt"));
            while (scan.hasNextLine()) {
                storms.add(new Storm(scan.nextLine()));
            }
        } catch (Exception e) {

        }

        for (Storm v : storms)
            name += v.getName() + "\n";

        return name;
    }

}