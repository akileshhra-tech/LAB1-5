package arraylist;

import java.util.ArrayList;
import java.util.List;

public class p5 {
    public static void main(String[] args) {
        
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original ArrayList: " + colors);

        // Extract 1st and 2nd elements using subList()
        List<String> subListColors = colors.subList(0, 2);

        // Display extracted elements
        System.out.println("Extracted elements (1st and 2nd): " + subListColors);
    }
}