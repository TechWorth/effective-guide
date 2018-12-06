import java.awt.*;
import javax.swing.*;

public class DrawGrids extends Frame {

  DrawGrids(String title, int w, int h, int rows, int columns) {
    setTitle(title);
    Grids grid = new Grids(w, h, rows, columns);
    add(grid);
  }

 // public static void main(String[] args) {
    //DrawGrids dg = new DrawGrids("Draw Grids", 200, 200, 10, 10);
    //dg.setVisible(true);//
  }//
}