// q44.java
import java.util.Scanner;

public class q44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Initialize the longest word
        String longestWord = words[0];

        // Loop through the words to find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Output the longest word
        System.out.println("The longest word is: " + longestWord);

        scanner.close();
    }
}
