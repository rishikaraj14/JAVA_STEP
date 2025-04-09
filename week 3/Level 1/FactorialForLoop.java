import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        
        if (num < 0) {
            System.out.println(" Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; 

            
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        scanner.close();
    }
}
