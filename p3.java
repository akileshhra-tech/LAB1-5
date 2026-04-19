package arraylist;

import java.util.*;

public class p3 {
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

        // Removing 2nd element (index 1)
        colors.remove(1);

        // Removing color "Blue"
        colors.remove("Blue");

        // Display updated list
        System.out.println("Updated List: " + colors);
    }
}