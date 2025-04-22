// q61.java
import java.util.Scanner;

public class q61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toLowerCase();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toLowerCase();

        // Check length first – if unequal, not anagrams
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Count character frequencies manually using arrays
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count frequencies for str1
        for (int i = 0; i < arr1.length; i++) {
            if (Character.isLetter(arr1[i])) {
                freq1[arr1[i] - 'a']++;
            }
        }

        // Count frequencies for str2
        for (int i = 0; i < arr2.length; i++) {
            if (Character.isLetter(arr2[i])) {
                freq2[arr2[i] - 'a']++;
            }
        }

        // Compare frequency arrays
        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                isAnagram = false;
                break;
            }
        }

        // Print result
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }
}
