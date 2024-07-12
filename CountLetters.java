import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26]; // Array to hold letter counts
        Scanner scan = new Scanner(System.in); // Scanner for input


        // Get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();


        // Convert to upper case
        word = word.toUpperCase();


        // Count frequency of each letter in the word
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }

        scan.close();

        
        // Print letter frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
