package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class p26 implements ActionListener {

    JFrame frame;
    JButton btnSrilanka, btnIndia;
    JLabel label;

    public p26() {

        // Create frame
        frame = new JFrame("Button Event Handling");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        btnSrilanka = new JButton("Srilanka");
        btnIndia = new JButton("India");

        // Create label
        label = new JLabel("Press a button");

        // Add ActionListener
        btnSrilanka.addActionListener(this);
        btnIndia.addActionListener(this);

        // Add components to frame
        frame.add(btnSrilanka);
        frame.add(btnIndia);
        frame.add(label);

        frame.setVisible(true);
    }

    // Event handling method
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSrilanka) {
            label.setText("Srilanka is pressed");
        } else if (e.getSource() == btnIndia) {
            label.setText("India is pressed");
        }
    }

    public static void main(String[] args) {
        new p26();
    }
}
