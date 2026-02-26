import java.util.Scanner;

/**
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing the input string.
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 */
public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management system");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();

        // 1. Normalization: Remove all non-alphanumeric characters and lowercase
        // [^a-zA-Z0-9] matches anything that is NOT a letter or number
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // 2. Compare characters from both ends (Using the provided hint loop)
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop if mismatch found
            }
        }

        // 3. Display result
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}
