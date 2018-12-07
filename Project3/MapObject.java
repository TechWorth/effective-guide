import java.awt.Graphics;

public class MapObject implements Drawable, Trackable {
    protected int x, y;

    public MapObject(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public double distance(Trackable obj) {
        int x = (getX() - obj.getX());
        int y = (getY() - obj.getY());
        int squareX = (x * x);
        int squareY = (y * y);
        int sum = squareX + squareY;
        double distance = (double) Math.sqrt(sum);
        return distance;

    }

    public void drawMe(Graphics g) {

    }

}