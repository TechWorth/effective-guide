import java.awt.event.ActionListener;
import java.util.*;

public class TextUI implements ActionListener {
    Scanner scan = new Scanner(System.in);

<<<<<<< HEAD
    public void actionperformed(ActionListener st){
        public TextUI(StormTracker st) {
            System.out.println("The COMMANDS ARE:" + "\n \n" + "STORM X Y" + "\n" + "UPGRADE <Storm name>" + "\n"
                    + "DOWNGRADE <Storm name>" + "\n" + "TICK" + "\n" + "STOP" + "\n" + "\n" + "Please input a command: ");
            st.doCommand(scan.nextLine());
            // code
=======
    public TextUI(StormTracker st) {
        System.out.println("The COMMANDS ARE:" + "\n \n" + "STORM X Y" + "\n" + "UPGRADE <Storm name>" + "\n"
                + "DOWNGRADE <Storm name>" + "\n" + "TICK" + "\n" + "STOP" + "\n" + "\n" + "Please input a command: ");

        st.doCommand(scan.nextLine());
        // code
    }

    public static void main(String[] args) {
        TextUI text = new TextUI(new StormTracker());

         WeatherAuthority we = new WeatherAuthority();
         System.out.println(we.getNextStorm());
        /*String command = "STORM 4 5";
        String[] com = command.split(" ");
        if (command.equals(com[0])){
            System.out.println(com[0]);
>>>>>>> refs/remotes/origin/GentlesWork
        }
    
        public static void main(String[] args){
            TextUI text = new TextUI(new StormTracker());
            WeatherAuthority we = new WeatherAuthority();
            System.out.println(we.getNextStorm());
        }
<<<<<<< HEAD
=======
        System.out.println(x);*/
>>>>>>> refs/remotes/origin/GentlesWork
    }

}