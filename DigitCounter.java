import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            // Convert the input to an integer
            int number = Integer.parseInt(input);

            // Count the digits
            int digitCount = countDigits(number);

            // Print the result
            System.out.println("Number of digits: " + digitCount);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }

        scanner.close();
    }

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        // Convert number to string and get the length
        return String.valueOf(Math.abs(number)).length();
    }
}