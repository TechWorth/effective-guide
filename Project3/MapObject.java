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
        int k;
        width = getSize().width;
        height = getSize().height;

        int htOfRow = height / (rows);
        for (k = 0; k < rows; k++)
          g.drawLine(0, k * htOfRow , width, k * htOfRow );

        int wdOfRow = width / (columns);
        for (k = 0; k < columns; k++)
          g.drawLine(k*wdOfRow , 0, k*wdOfRow , height);
    }

}