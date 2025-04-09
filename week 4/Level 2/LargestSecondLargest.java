import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int maxDigit = 10; // Initial maximum number of digits
        int[] digits = new int[maxDigit]; // Array to store digits
        int index = 0; // To track the array index

        // Extracting digits and storing them in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;

                // Create a new temporary array of increased size
                int[] temp = new int[maxDigit];

                // Copy existing digits to the new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the new array to digits
                digits = temp;
            }

            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++;
        }

        // Finding the largest and second-largest digits
        int largest = -1;
        int secondLargest = -1; // Initialize to -1 to handle cases where there is no second largest

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest before updating largest
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying the results
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }

        scanner.close();
    }
}
