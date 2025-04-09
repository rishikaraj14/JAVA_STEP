import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Handling negative numbers
        int temp = Math.abs(number);

        // Finding the count of digits
        int count = 0;
        int tempNumber = temp;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        // Storing digits in an array
        int[] digits = new int[count];
        tempNumber = temp;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10; // Extract the last digit
            tempNumber /= 10; // Remove the last digit
        }

        // Reversing the digits and displaying them
        System.out.print("Reversed number: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }

        // Handling negative number display
        if (number < 0) {
            System.out.print(" (negative)");
        }

        System.out.println(); // For a clean line

        scanner.close();
    }
}
