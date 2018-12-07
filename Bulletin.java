import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

public class Bulletin {
    ArrayList<Storm> storms = new ArrayList<Storm>();
    static int count = 1;
    public Alert alert =new Alert();
    public String cname;
    public String sname;

    public Bulletin(String cname, String name,Alert alert){
        super(cname,sname);
        if (alert
         do {
            count++;
        }while (count=1);
        public int getBulletinNo() {
            return count;
        }
        public String getBulletinText() {
            return storms.toString();
        }
    }
    public void write()throws IOException{
        String str="";
        str+=getBulletinText();
        BufferedWriter writer = new BufferedWriter(new FileWriter("bulletin.txt"));
        return writer.write(str);
        writer.close();
    }
}