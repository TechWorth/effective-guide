import java.awt.event.ActionListener;
import java.util.*;

public class TextUI implements ActionListener {
    Scanner scan = new Scanner(System.in);

    public void actionperformed(ActionListener st){
        public TextUI(StormTracker st) {
            System.out.println("The COMMANDS ARE:" + "\n \n" + "STORM X Y" + "\n" + "UPGRADE <Storm name>" + "\n"
                    + "DOWNGRADE <Storm name>" + "\n" + "TICK" + "\n" + "STOP" + "\n" + "\n" + "Please input a command: ");
            st.doCommand(scan.nextLine());
            // code
        }
    
        public static void main(String[] args){
            TextUI text = new TextUI(new StormTracker());
            WeatherAuthority we = new WeatherAuthority();
            System.out.println(we.getNextStorm());
        }
    }

}