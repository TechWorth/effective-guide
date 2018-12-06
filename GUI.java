import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class GUI {
    public static void main(String[] args) {
        JFrame fr1 = new JFrame("Storm Tracker v1.0");
        JPanel main = new JPanel();
        JPanel display = new JPanel();
        JPanel lower = new JPanel();
        JPanel left = new JPanel(new GridBagLayout());
        JPanel above = new JPanel();

        JButton B1 = new JButton("New Storm");
        JButton B2 = new JButton("Update");
        JButton B3 = new JButton("GO");

        JRadioButton B4 = new JRadioButton("Map");
        JRadioButton B5 = new JRadioButton("BulletIn");
        JTextField speed = new JTextField();

        JLabel lab1 = new JLabel("Speed :");
        JLabel lab2 = new JLabel("X :");
        JLabel lab3 = new JLabel("Strenght :");
        JLabel lab4 = new JLabel("Bearing:");
        JLabel lab5 = new JLabel("Y:");
        JLabel lab6 = new JLabel("x:");
        JLabel lab7 = new JLabel("y:");

        display.setPreferredSize(new Dimension(1000, 500));
        main.setPreferredSize(new Dimension(2000, 3000));
        main.setPreferredSize(new Dimension(200, 300));
        main.setBackground(Color.cyan);
        display.setBackground(Color.GRAY);
        lower.setBackground(Color.cyan);
        left.setBackground(Color.cyan);
        above.setBackground(Color.cyan);
        main.setVisible(true);
        lab1.add(speed, new TextArea(" "));
        display.setVisible(true);
        fr1.setVisible(true);
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.add(main, BorderLayout.CENTER);
        fr1.add(lower, BorderLayout.SOUTH);
        fr1.add(left, BorderLayout.WEST);
        fr1.add(above, BorderLayout.NORTH);
        main.add(display, BorderLayout.EAST);
        lower.add(B3, BorderLayout.WEST);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);
        left.add(B1, c);
        c.gridx = 0;
        c.gridy = 1;
        left.add(B2, c);
        c.gridx = 0;
        c.gridy = 5;
        above.add(B4, c);
        above.add(B5, c);
        GridBagConstraints s = new GridBagConstraints();
        s.insets = new Insets(20, 20, 20, 20);
        s.gridx = 1;
        left.add(lab1, s);
        left.add(lab2, s);
        left.add(lab3, s);
        left.add(lab4, s);
        left.add(lab5, s);
        left.add(lab6, s);
        left.add(lab7, s);
    }
}
