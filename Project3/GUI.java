import java.awt.*;
import java.awt.EventQueue;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {

    private JPanel contentPane;
    private JLabel x;
    private JLabel y;
    private JTextField textBearing;
    private JLabel labelBearing;
    private JTextField textSpeed;
    private JLabel labelSpeed;
    private JTextField textStrength;
    private JLabel labelStrength;
    private Button update;
    private Button newStorm;

    int xx, xy;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setUndecorated(true);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    // going to borrow code from a list to move frame.

    /**
     * Create the frame.
     */
    public GUI() {
        // main frame

        setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250, 150, 729, 476);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        GridLayout gl = new GridLayout(10, 10);
        JPanel panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        for (int i = 0; i < (10 * 10); i++) {
            final JLabel label = new JLabel();
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel2.add(label);
        }
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setBounds(180, 50, 400, 350);
        contentPane.add(panel2);
        panel2.setLayout(gl);

        /*
         * JLabel label = new JLabel(""); label.setBounds(0, 0, 450, 350);
         * label.setVerticalAlignment(SwingConstants.TOP); label.setIcon(new
         * ImageIcon(GUI.class.getResource("bg.PNG"))); panel2.add(label);
         */

        JRadioButton map = new JRadioButton("Map");
        map.setMnemonic(KeyEvent.VK_B);
        map.setBounds(395, 58, 114, 14);
        map.setActionCommand("Map");
        map.setSelected(true);

        JRadioButton bullitin = new JRadioButton("Bulitting");
        bullitin.setMnemonic(KeyEvent.VK_B);
        bullitin.setActionCommand("Bulitting");
        bullitin.setSelected(false);
        contentPane.add(bullitin);

        ButtonGroup group = new ButtonGroup();
        group.add(map);
        group.add(bullitin);

        // nav west
        JPanel west = new JPanel();
        west.setBackground(Color.DARK_GRAY);
        west.setBounds(0, 0, 170, 500);
        contentPane.add(west);
        west.setLayout(null);

        JToggleButton bar = new JToggleButton("SELECT STORM");
        bar.setForeground(Color.WHITE);
        bar.setBackground(new Color(241, 57, 83));
        bar.setBounds(10, 10, 150, 40);
        west.add(bar);

        x = new JLabel("X:");
        x.setHorizontalAlignment(SwingConstants.LEFT);
        x.setFont(new Font("Tahoma", Font.PLAIN, 18));
        x.setForeground(new Color(240, 248, 255));
        x.setBounds(10, 50, 104, 27);
        west.add(x);

        y = new JLabel("Y:");
        y.setHorizontalAlignment(SwingConstants.LEFT);
        y.setFont(new Font("Tahoma", Font.PLAIN, 18));
        y.setForeground(new Color(240, 248, 255));
        y.setBounds(10, 80, 104, 27);
        west.add(y);

        labelSpeed = new JLabel("Speed:");
        labelSpeed.setHorizontalAlignment(SwingConstants.LEFT);
        labelSpeed.setFont(new Font("Tahoma", Font.PLAIN, 15));
        labelSpeed.setForeground(new Color(240, 248, 255));
        labelSpeed.setBounds(10, 143, 104, 15);
        west.add(labelSpeed);

        textSpeed = new JTextField();
        textSpeed.setColumns(0);
        textSpeed.setBounds(75, 143, 70, 15);
        west.add(textSpeed);

        labelStrength = new JLabel("Strength:");
        labelStrength.setHorizontalAlignment(SwingConstants.LEFT);
        labelStrength.setFont(new Font("Tahoma", Font.PLAIN, 15));
        labelStrength.setForeground(new Color(240, 248, 255));
        labelStrength.setBounds(10, 115, 104, 15);
        west.add(labelStrength);

        textStrength = new JTextField();
        textStrength.setColumns(0);
        textStrength.setBounds(75, 115, 70, 15);
        west.add(textStrength);

        labelBearing = new JLabel("Bearing:");
        labelBearing.setHorizontalAlignment(SwingConstants.LEFT);
        labelBearing.setFont(new Font("Tahoma", Font.PLAIN, 15));
        labelBearing.setForeground(new Color(240, 248, 255));
        labelBearing.setBounds(10, 170, 104, 15);
        west.add(labelBearing);

        textBearing = new JTextField();
        textBearing.setColumns(0);
        textBearing.setBounds(75, 171, 70, 15);
        west.add(textBearing);

        update = new Button("UPDATE");
        update.setForeground(Color.WHITE);
        update.setBackground(new Color(241, 57, 83));
        update.setBounds(10, 200, 150, 40);
        west.add(update);

        newStorm = new Button("NEW STORM");
        newStorm.setForeground(Color.WHITE);
        newStorm.setBackground(new Color(241, 57, 83));
        newStorm.setBounds(10, 270, 150, 40);
        west.add(newStorm);

        JLabel x2 = new JLabel("X:");
        x2.setHorizontalAlignment(SwingConstants.LEFT);
        x2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        x2.setForeground(new Color(240, 248, 255));
        x2.setBounds(10, 320, 104, 15);
        west.add(x2);

        JTextField textX = new JTextField();
        textX.setColumns(0);
        textX.setBounds(75, 320, 70, 20);
        west.add(textX);

        JLabel y2 = new JLabel("Y:");
        y2.setHorizontalAlignment(SwingConstants.LEFT);
        y2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        y2.setForeground(new Color(240, 248, 255));
        y2.setBounds(10, 350, 104, 27);
        west.add(y2);

        JTextField textY = new JTextField();
        textY.setColumns(0);
        textY.setBounds(75, 352, 70, 20);
        west.add(textY);

        JLabel lbl_close = new JLabel("X");
        lbl_close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                System.exit(0);
            }
        });
        lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_close.setForeground(new Color(241, 57, 83));
        lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbl_close.setBounds(691, 0, 37, 27);
        contentPane.add(lbl_close);

        JPanel east = new JPanel();
        east.setBackground(Color.DARK_GRAY);
        east.setBounds(590, 0, 170, 500);
        contentPane.add(east);
        east.setLayout(null);

        JRadioButton mapRadio = new JRadioButton("Map");
        // mapRadio.setForeground(Color.DARK_GRAY);
        mapRadio.setFont(new Font("Tahoma", Font.PLAIN, 12));
        mapRadio.setBackground(new Color(105, 105, 105));
        mapRadio.setBounds(20, 80, 70, 20);
        mapRadio.setSelected(true);
        east.add(mapRadio);
        mapRadio.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

            }
        });

        JRadioButton bul = new JRadioButton("Bulliting");
        // mapRadio.setForeground(Color.DARK_GRAY);
        bul.setFont(new Font("Tahoma", Font.PLAIN, 12));
        bul.setBackground(new Color(105, 105, 105));
        bul.setBounds(20, 110, 70, 20);
        bul.setSelected(false);
        east.add(bul);

        JPanel north = new JPanel();
        north.setBackground(Color.DARK_GRAY);
        north.setBounds(170, 0, 559, 40);
        contentPane.add(north);
        north.setLayout(null);

        JPanel south = new JPanel();
        south.setBackground(Color.DARK_GRAY);
        south.setBounds(170, 410, 559, 80);
        contentPane.add(south);
        south.setLayout(null);

        JTextField textGo = new JTextField();
        textGo.setColumns(0);
        textGo.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textGo.setBounds(250, 10, 80, 40);
        south.add(textGo);

        JButton go = new JButton("GO");
        go.setForeground(Color.WHITE);
        go.setBackground(new Color(241, 57, 83));
        go.setBounds(90, 10, 150, 40);
        south.add(go);
        go.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                System.exit(1);
            }
        });

    }

}
