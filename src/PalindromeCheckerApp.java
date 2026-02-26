import java.util.Scanner;

/**
 * MAIN CLASS -
 * Validates a palindrome using recursion.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management system");
        System.out.println("Version : 9.0");
        System.out.println("System initialized successfully");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text:");
        String s1 = sc.nextLine();

        // Call the recursive check method starting from index 0 to length-1
        boolean pal = check(s1.toLowerCase(), 0, s1.length() - 1);

        System.out.println("\n--- UC9 Recursive Analysis ---");
        System.out.println("Input Text: " + s1);
        System.out.println("Is it a palindrome? " + pal);

        sc.close();
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Case 1: If start meets or crosses end, all characters matched
        if (start >= end) {
            return true;
        }

        // Base Case 2: If characters at current positions don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Step: Move pointers inward and check again
        return check(s, start + 1, end - 1);
    }
}
