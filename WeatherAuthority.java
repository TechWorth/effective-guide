import java.io.*;
import java.util.*;
import java.util.Random;

public class WeatherAuthority {
    ArrayList<Storm> storms = new ArrayList<Storm>();
    ArrayList<Storm> usedname = new ArrayList<Storm>();
    String name = "" ;
    String name3 = "";
    private Random random = new Random();

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

            for (int i =0; i < storms.size(); i++){
                Storm name2 = storms.get(random.nextInt(storms.size()));
                
                name3 = name2.getName();
            }

        return name3;
    }

}