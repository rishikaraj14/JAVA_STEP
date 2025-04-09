import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a natural number (n > 0): ");
        int n = scanner.nextInt();

               if (n > 0) {
           
            int sumFormula = n * (n + 1) / 2;

            
            int sumForLoop = 0;

            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }

         
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumForLoop);

            
            if (sumFormula == sumForLoop) {
                System.out.println(" Both computations match. The sum calculation is correct!");
            } else {
                System.out.println(" There is a mismatch in the calculations.");
            }
        } else {
            System.out.println(" The number " + n + " is not a natural number.");
        }

        scanner.close(); // Closing scanner
    }
}
