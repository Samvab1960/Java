// q45.java
import java.util.Scanner;

public class q45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Initialize the shortest word as the first word
        String shortestWord = words[0];

        // Loop through the words to find the shortest one
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        // Output the shortest word
        System.out.println("The shortest word is: " + shortestWord);

        scanner.close();
    }
}
