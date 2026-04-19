package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p27 implements ActionListener {

    JFrame frame;
    JButton btnClock, btnHourGlass;
    JLabel label;

    public p27() {

        // Create frame
        frame = new JFrame("Image Button Event");
        frame.setSize(500, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load images (make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create buttons with images
        btnClock = new JButton("Digital Clock", clockIcon);
        btnHourGlass = new JButton("Hour Glass", hourGlassIcon);

        // Create label
        label = new JLabel("Press a button");

        // Add action listeners
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Add components to frame
        frame.add(btnClock);
        frame.add(btnHourGlass);
        frame.add(label);

        frame.setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            label.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new p27();
    }
}