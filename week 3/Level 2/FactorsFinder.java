import java.util.Scanner;

class FactorsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");

        // Loop to find factors
        for (int i = 1; i <= number; i++) { 
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
