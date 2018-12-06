import java.util.ArrayList;

public class Bulletin {
    ArrayList<Storm> storms = new ArrayList<Storm>();
    static int count = 1;
    do {
        public int getBulletinNo() {
            return count;
        }
    public String getBulltinText() {
            count++;
            return storms.toString();
        }
    }while (count=1);

}