import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text:");
        String s1 = sc.nextLine();

        // 1. Create an empty string to store the reverse
        String reversed = "";
        int length = s1.length();

        // 2. Loop backwards to reverse the string
        for (int i = length - 1; i >= 0; i--) {
            reversed = reversed + s1.charAt(i);
        }

        // 3. Compare original and reversed (ignoring case)
        boolean pal = s1.equalsIgnoreCase(reversed);

        // 4. Display result
        System.out.println("Original: " + s1);
        System.out.println("Reversed: " + reversed);
        System.out.println("Is it a palindrome? " + pal);

        sc.close();
    }
}
