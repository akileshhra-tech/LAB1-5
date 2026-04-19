package arraylist;

import java.util.LinkedList;

public class p9 {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> colors = new LinkedList<>();

        // Add initial elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // Display original list
        System.out.println("Original LinkedList: " + colors);

        // Insert element at the end using offerLast()
        colors.offerLast("Pink");

        // Display updated list
        System.out.println("LinkedList after adding element at end: " + colors);
    }
}