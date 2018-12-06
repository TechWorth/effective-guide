import java.util.*;

public class StormTracker {
    private String region;
    public int MAX_X, MAX_Y;
    ArrayList<Storm> storm = new ArrayList<Storm>();
    WeatherAuthority wA = new WeatherAuthority();
    Random random = new Random();

    public void doCommand(String command) {
        
        String[] com = command.split(" ");
        String y="";
        String x ="";
        for(int i = 1; i< com.length; i++){
        x = com[i];
        }
        for (Storm val : storm) {
            if (command.equals("STORM" + " " + x + " " + y)) {
                storm.add(new Storm(wA.getNextStorm(), Integer.parseInt(x), Integer.parseInt(y)));
            } else if (command.equals("UPGRADE" + " " + x)) {
                val.update(random.nextInt(10));

            } else if (command.equals("DOWNGRADE" + " " + x)) {

            } else if (command.equals("TICK")) {

            } else if (command.equals("STOP")) {
                System.exit(0);

            }

        }
    }
    
}