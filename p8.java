package arraylist;

import java.util.LinkedList;
import java.util.Iterator;

public class p8 {
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

        // Get descending iterator
        Iterator<String> iterator = colors.descendingIterator();

        // Iterate in reverse order
        System.out.println("LinkedList in reverse order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}