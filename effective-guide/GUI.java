import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
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
        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        JButton B1 = new JButton("New Storm");
        JButton B2 = new JButton("Update");
        JButton B3 = new JButton("GO");
        JTextField speed = new JTextField();
        JLabel lab1 = new JLabel("Speed :");
        JLabel lab2 = new JLabel("X :");
        JLabel lab3 = new JLabel("Strenght :");
        JLabel lab4 = new JLabel("Bearing:");
        JLabel lab5 = new JLabel("Y:");
        JLabel lab6 = new JLabel("x:");
        JLabel lab7 = new JLabel("y:");
        pan2.setPreferredSize(new Dimension(1000, 1500));
        pan1.setBackground(Color.BLUE);
        pan2.setBackground(Color.GRAY);
        pan1.setVisible(true);
        lab1.setVisible(true);
        lab2.setVisible(true);
        lab3.setVisible(true);
        lab4.setVisible(true);
        lab5.setVisible(true);
        lab6.setVisible(true);
        lab7.setVisible(true);
        B1.setBounds(20, 25, 12, 35);
        B2.setBounds(250, 250, 120, 35);
        B1.setVisible(true);
        B2.setVisible(true);
        B3.setVisible(true);
        pan2.setVisible(true);
        fr1.setVisible(true);
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.add(pan1);
        pan1.add(B1);
        pan1.add(B2);
        pan1.add(B3);
        pan1.add(lab1);
        pan1.add(lab2);
        pan1.add(lab3);
        pan1.add(lab4);
        pan1.add(lab5);
        pan1.add(lab6);
        pan1.add(lab7);

    }
}
