import java.awt.Graphics;
import java.awt.*;
    import java.awt.event.*;

public class MapObject extends Canvas implements Drawable, Trackable {
    protected int x, y;
    private int width, height;

    public MapObject(int x, int y) {
        this.x = x;
        this.y = y;

    }
    

    public MapObject(int w, int h, int x, int y) {
      setSize(width = w, height = h);
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
    
            int htOfRow = height / (x);
            for (k = 0; k < x; k++)
              g.drawLine(0, k * htOfRow , width, k * htOfRow );
    
            int wdOfRow = width / (y);
            for (k = 0; k < y; k++)
              g.drawLine(k*wdOfRow , 0, k*wdOfRow , height);
            }
        
    }

