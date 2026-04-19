package swing;



import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class p28 {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Country List");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Country list
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> countryList = new JList<>(countries);

        // Set selection mode (single selection)
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add ListSelectionListener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selected = countryList.getSelectedValue();
                    System.out.println("Selected Country: " + selected);
                }
            }
        });

        // Add JList inside JScrollPane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add to frame
        frame.add(scrollPane);

        // Make visible
        frame.setVisible(true);
    }
}