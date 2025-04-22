import java.util.HashSet;

public class q93 {
    public static void main(String[] args) {
        // Example input string
        String str = "madam arora teaches malayalam";
        
        // Call method to find all palindromes in the string
        findPalindromes(str);
    }

    // Method to find all palindromes in a given string
    public static void findPalindromes(String str) {
        // HashSet to store unique palindromes
        HashSet<String> palindromes = new HashSet<>();
        
        // Loop through the string to find palindromes
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                
                // Check if the substring is a palindrome
                if (isPalindrome(substring)) {
                    // Add palindrome to the set to avoid duplicates
                    if (substring.length() > 1) {
                        palindromes.add(substring);
                    }
                }
            }
        }
        
        // Print all palindromes
        System.out.println("Palindromes in the given string: ");
        for (String palindrome : palindromes) {
            System.out.println(palindrome);
        }
    }

    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        // Check for palindrome by comparing characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
