import java.util.*;

public class TextUI {

    Scanner scan = new Scanner(System.in);

    public TextUI(StormTracker st) {
        System.out.println("The COMMANDS ARE:" + "\n \n" + "STORM X Y" + "\n" + "UPGRADE <Storm name>" + "\n"
                + "DOWNGRADE <Storm name>" + "\n" + "TICK" + "\n" + "STOP" + "\n" + "\n" + "Please input a command: ");

        st.doCommand(scan.nextLine());
        // code
    }

    public static void main(String[] args) {
        //TextUI text = new TextUI(new StormTracker());

        // WeatherAuthority we = new WeatherAuthority();
        // System.out.println(we.getNextStorm());
        String command = "STORM 4 5";
        String[] com = command.split(" ");
        if (command.equals(com[0])){
            System.out.println(com[0]);
        }
        String y = "";
        String x = "";
        for(int i = 0; i< com.length; ++i){
        x+= " "+com[i];
        }
        System.out.println(x);
    }
}