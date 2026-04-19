package arraylist;

import java.util.*;

public class p2 {
    public static void main(String[] args) {

        // Creating ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("White");

        // Display colors
        System.out.println("List of Colors: " + colors);

        // Searching for "Red"
        if (colors.contains("Red")) {
            System.out.println("Red color is available in the list.");
        } else {
            System.out.println("Red color is NOT available in the list.");
        }
    }
}