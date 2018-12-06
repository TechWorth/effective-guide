import java.util.*;

public class StormTracker {
    private String region;
    public int MAX_X, MAX_Y;
    ArrayList<Storm> storm = new ArrayList<Storm>();
    WeatherAuthority wA = new WeatherAuthority();
    Random random = new Random();

    public void doCommand(String command) {
        String[] com = new String[4];
        com = command.split(" ");
        // for (Storm val : storm) {
        if (command.equals("TICK")) {
            System.out.println("Ticked");

        } else if (command.equals("STOP")) {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    // saved data
                    System.out.println("Exiting");
                }

            });

        } else if (command.equals("UPGRADE" + " " + com[1])) {

            if (storm.contains(com[1])) {
                for (Storm val : storm)
                    val.update(random.nextInt(10));
                System.out.println("Upgraded!!");
            } else {
                System.out.println("No Storm Found!");
            }
        } else if (command.equals("DOWNGRADE" + " " + com[1])) {
            System.out.println("Downgraded!!");
        } else if (command.equals("STORM" + " " + com[1] + " " + com[2])) {
            storm.add(new Storm(wA.getNextStorm(), Integer.parseInt(com[1]), Integer.parseInt(com[2])));
            System.out.println("New Storm Created");

        } else if (command.equals(" " + " " + " " + " " + " ")) {
            System.out.println("Command is empty");
        }

        // }
    }

}