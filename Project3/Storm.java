public class Storm extends MapObject {
    private String name;
    private int strength, speed;
    private double bearing;
    private int ticks;
    private double distance;
    private static int MAX_X = 10;
    private static int MAX_Y = 10;

    public Storm(String name, int strength, int speed, double bearing) {
        super(MAX_X, MAX_Y);
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.bearing = bearing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setBearings(double bearing) {
        this.bearing = bearing;
    }

    public double getBearings() {
        return bearing;
    }

    public void update(int tick) {
        this.ticks = tick;
        double x1 = super.getX();
        double y1 = super.getY();
        int speed = getSpeed();
        double bearing = getBearings();
        distance = speed * ticks;
        super.x = (int) (x1 + (distance * Math.cos(bearing)));
        super.y = (int) (y1 + (distance * Math.sin(bearing)));
    }

    public String toString() {
        String print = "";
        print += "Storm Name: " + getName() + "\n";
        print += getName() + " strength: " + getStrength() + " miles per hour" + "\n";
        print += getName() + " speed: " + getSpeed() + " miles per hour" + "\n";
        print += getName() + " Borned at " + "(" + MAX_X + "," + MAX_Y + ")" + "\n";
        print += getName() + " is currently at" + " (" + x + "," + y + ")" + " with a bearing of " + getBearings()
                + " degrees" + "\n";
        return print;
    }

}