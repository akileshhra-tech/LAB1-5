package stringoperation;



import java.util.Arrays;

public class p12 {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0,4): " + text.substring(0, 4));

        // 6. String Modification
        String modified = text.replace("Java", "Python");
        System.out.println("Modified string: " + modified);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 7. Whitespace Handling
        String str4 = "   Welcome Java   ";
        System.out.println("Before trim: '" + str4 + "'");
        System.out.println("After trim: '" + str4.trim() + "'");

        // 8. String Concatenation
        String concat = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concat);

        // 9. String Splitting
        String sentence = "Java,Python,C++,JavaScript";
        String[] parts = sentence.split(",");
        System.out.println("Split strings: " + Arrays.toString(parts));

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        System.out.println("StringBuilder result: " + sb);

        // 11. String Formatting
        String name = "Aditya";
        int age = 20;
        String formatted = String.format("My name is %s and I am %d years old", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email using contains(), startsWith(), endsWith()
        String email = "example@gmail.com";

        if (email.contains("@") && email.contains(".") &&
            !email.startsWith("@") &&
            (email.endsWith(".com") || email.endsWith(".in"))) {
            System.out.println("Valid Email: " + email);
        } else {
            System.out.println("Invalid Email: " + email);
        }
    }
}