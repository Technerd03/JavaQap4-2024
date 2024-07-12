// Program to parse integers from a line of text and sum them
import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0; // Variables for value and sum
        Scanner scan = new Scanner(System.in); // Scanner for input


        // Prompt for and read a line of text
        System.out.println("Enter a line of text:");
        String line = scan.nextLine();
        Scanner scanLine = new Scanner(line); // Scanner for the line


        // Parse integers from the line and sum them
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // Ignoring non-integer tokens
            }
        }

        scan.close();
        scanLine.close();

        
        // Print the sum of the integers
        System.out.println("The sum of the integers on this line is " + sum);
    }
}

