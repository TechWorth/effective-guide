import java.util.*;

public class TextUI {
    Scanner scan = new Scanner(System.in);
    StormTracker st;
    public static int on = 1;

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

}