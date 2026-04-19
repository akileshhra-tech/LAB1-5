package arraylist;

import java.util.LinkedList;
import java.util.Collections;

public class p11 {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> colors = new LinkedList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original LinkedList: " + colors);

        // Swap 1st and 3rd elements (index 0 and 2)
        Collections.swap(colors, 0, 2);

        // Display updated list
        System.out.println("LinkedList after swapping 1st and 3rd elements: " + colors);
    }
}