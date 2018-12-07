import java.util.Scanner;

public class OOP_project {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the Storm name ?");
        String name = scan.nextLine();
        MapObject map = new MapObject(6, 5);
        Storm storm = new Storm(name, 12, 3, 80.0);

        storm.update(2);
        System.out.println(storm.toString());

        scan.close();

        Country c = new Country("Jamaica", 20000, 0, 2);
        System.out.println(c.toString());

        System.out.println(map.drawMe(new Graphics()));

    }
}