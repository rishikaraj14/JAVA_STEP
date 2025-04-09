import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();

        while (counter > 0) {
            System.out.println(counter); // Print countdown number
            counter--; // Decrement counter
        }

        // Print liftoff message after countdown ends
        System.out.println("Liftoff!");

        scanner.close(); 
    }
}
