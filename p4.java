package arraylist;

import java.util.*;

public class p4 {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Sorting the ArrayList
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted List: " + colors);
    }
}