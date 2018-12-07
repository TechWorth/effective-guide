import java.util.*;

public class StormTracker {
    private String region;

    ArrayList<Storm> storm = new ArrayList<Storm>();
    WeatherAuthority wA = new WeatherAuthority();
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    String command;
    public static int MAX_X, MAX_Y;

    public StormTracker(String region, int MAX_X, int MAX_Y) {
        this.region = region;
        this.MAX_X = MAX_X;
        this.MAX_Y = MAX_Y;
    }

    public String doCommand(String command) {
        this.command = command;
        if (command.toUpperCase().equals("STORM")) {
            System.out.println(newStorm() + " " + "was Created");
        } else if (command.toUpperCase().equals("STOP")) {
            return stop();
        } else if (command.toUpperCase().equals("UPGRADE")) {
            return Upgrade();
        } else if (command.toUpperCase().equals("DOWNGRADE")) {
            return Downgrade();
        }
        System.out.println("Invalid Command");
        return "Invalid Command";
    }

    
    public String newStorm() {
        System.out.println("Enter Storm's Latitude/X  Value: ");
        int x = scan.nextInt();
        System.out.println("Enter Storm's Longitude/Y  Value: ");
        int y = scan.nextInt();
        String newName = wA.getNextStorm();
        storm.add(new Storm(newName, x, y));
        return newName;

    }

    public String Upgrade() {
        System.out.println("Enter Strom Name: ");
        String stormName = scan.nextLine();
        for (Storm val : storm)
            if (stormName.equals(val.getName())) {
                val.update(random.nextInt(5));
            }
        return "Updated!!";
    }

    public String Downgrade() {
        System.out.println("Enter Strom Name: ");
        String stormName = scan.nextLine();
        for (Storm val : storm)
            if (stormName.equals(val.getName())) {
                val.update(random.nextInt(5));
            }
        return "Downgraded!!";
    }

    public String stop() {
        TextUI.on = 0;
        return "Program Ended";
    }

    public String Tick() {
        return "";

    }

}