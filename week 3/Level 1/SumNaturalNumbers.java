import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a natural number (n > 0): ");
        int n = scanner.nextInt();

        
        if (n > 0) {
            
            int sumFormula = n * (n + 1) / 2;

            
            int sumWhileLoop = 0;
            int counter = 1;

            while (counter <= n) {
                sumWhileLoop += counter;
                counter++;
            }

            
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhileLoop);

            
            if (sumFormula == sumWhileLoop) {
                System.out.println("Both computations match. The sum calculation is correct!");
            } else {
                System.out.println(" There is a mismatch in the calculations.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        scanner.close(); 
    }
}
