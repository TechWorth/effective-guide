import java.util.ArrayList;

public class Bulletin {
    ArrayList<Storm> storms = new ArrayList<Storm>();
    static int count = 0;

    public int getBulletinNo() {
        return count;
    }

    public String getBulltinText() {
        count++;
        return storms.toString();
    }
}