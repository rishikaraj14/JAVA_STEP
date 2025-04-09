import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        
        if (num < 0) {
            System.out.println(" Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            int counter = num;

            
            while (counter > 0) {
                factorial *= counter;
                counter--;
            }

            
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        scanner.close(); // Close scanner
    }
}
