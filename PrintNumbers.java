import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter an integer N: ");
        int N = scanner.nextInt();

        // Initialize a StringBuilder to construct the output
        StringBuilder output = new StringBuilder("array = ");

        // Loop through numbers from 1 to N and append them to the StringBuilder
        for (int i = 1; i <= N; i++) {
            output.append(i);
            if (i < N) {
                output.append(",");
            }
        }

        // Print the resulting array
        System.out.println(output.toString());

        // Close the scanner
        scanner.close();
    }
}