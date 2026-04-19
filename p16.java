package stringoperation;

import java.util.Scanner;

public class p16 {

    // User-defined function
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index = index + subStr.length(); // move ahead
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring: ");
        String subStr = sc.nextLine();

        int result = countOccurrences(mainStr, subStr);

        System.out.println("Substring appears " + result + " times.");

        sc.close();
    }
}