import java.util.Scanner;

class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int greatestFactor = 1; // Default value

        // Loop from number-1 to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if i is a factor
                greatestFactor = i;
                break; // Stop at the first (largest) factor found
            }
        }

        // Display the result
        System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        scanner.close();
    }
}
