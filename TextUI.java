import java.awt.event.ActionListener;
import java.util.*;

<<<<<<< HEAD
public class TextUI implements ActionListener {
=======
public class TextUI {
>>>>>>> fd6b1742acb96471d7d16a27963c517dff25b69b
    Scanner scan = new Scanner(System.in);
    StormTracker st;
    public static int on = 1;

<<<<<<< HEAD
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

=======
    public TextUI(StormTracker st) {// TextUI constructor
        this.st = st;
        // code
    }

    public void Showcommand() {
        while (on == 1) {
            System.out.println("-The COMMANDS ARE: -" + "\n \n" + "#STORM X Y" + "\n" + "#UPGRADE <Storm name>" + "\n"
                    + "#DOWNGRADE <Storm name>" + "\n" + "#TICK" + "\n" + "#STOP" + "\n" + "\n");

            String command = "";
            System.out.println("#Please input a command: ");
            command = scan.nextLine();
            st.doCommand(command);

        }
    }

    public static void main(String[] args) {
        // CountryList caribbean = new CountryList();
        // System.out.println(caribbean.toString());
        TextUI text = new TextUI(new StormTracker("Caribbean", 30, 30));// makes an instance of the
        text.Showcommand();
        // TextUi constructor

        // DrawGrids dg = new DrawGrids("Draw Grids", 200, 200, 10, 10);
        // dg.setVisible(true);
        // dg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // dg.setLocationRelativeTo(null); // center the application window

    }

>>>>>>> fd6b1742acb96471d7d16a27963c517dff25b69b
}