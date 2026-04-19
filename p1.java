package arraylist;
import java.util.*;

public class p1 {

    public static void main(String[] args) {

        // Creating ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Initial ArrayList: " + arrayList);
        System.out.println("Initial LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");

        System.out.println("\nAfter adding at index 1:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        System.out.println("\nAfter adding multiple elements:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 4. Accessing elements
        System.out.println("\nAccess element at index 2 (ArrayList): " + arrayList.get(2));
        System.out.println("Access element at index 2 (LinkedList): " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Kiwi");
        linkedList.set(0, "Kiwi");

        System.out.println("\nAfter updating first element:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        System.out.println("\nAfter removing 'Banana':");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 7. Searching elements
        System.out.println("\nIs 'Apple' present in ArrayList? " + arrayList.contains("Apple"));
        System.out.println("Index of 'Orange' in LinkedList: " + linkedList.indexOf("Orange"));

        // 8. List size
        System.out.println("\nSize of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());

        // 9. Iterating over list (for-each loop)
        System.out.println("\nIterating ArrayList:");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }

        System.out.println("\nIterating LinkedList:");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }

        // 10. Using Iterator
        System.out.println("\n\nUsing Iterator (ArrayList):");
        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);

        System.out.println("\n\nAfter sorting:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 12. Sublist
        List<String> subArray = arrayList.subList(0, 2);
        System.out.println("\nSublist of ArrayList (0 to 2): " + subArray);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();

        System.out.println("\nAfter clearing lists:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
