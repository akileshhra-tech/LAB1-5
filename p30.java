package swing;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.util.HashMap;

public class p30 {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Country Capitals");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Country list
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Map to store country-capital pairs
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Not Applicable");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add ListSelectionListener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selected = countryList.getSelectedValue();
                    String capital = capitals.get(selected);
                    System.out.println("Country: " + selected + " -> Capital: " + capital);
                }
            }
        });

        // Add JList to scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);
        frame.add(scrollPane);

        // Show frame
        frame.setVisible(true);
    }
}
