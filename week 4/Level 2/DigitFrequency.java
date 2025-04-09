import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Handling negative numbers
        number = Math.abs(number);

        // Extract digits and store them in an array
        int[] digits = new int[20]; // Assuming max 20 digits
        int index = 0;
        int temp = number;

        while (temp != 0) {
            digits[index] = temp % 10; // Get the last digit
            temp /= 10;                // Remove the last digit
            index++;
        }

        // Frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // Counting frequency of each digit
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        // Displaying the frequency of each digit
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // Display only digits that are present
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
