package arraylist;
import java.util.LinkedList;
import java.util.ListIterator;

public class p7 {
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

        // Create ListIterator starting from index 1 (2nd position)
        ListIterator<String> iterator = colors.listIterator(1);

        // Iterate from 2nd element
        System.out.println("Elements from 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}