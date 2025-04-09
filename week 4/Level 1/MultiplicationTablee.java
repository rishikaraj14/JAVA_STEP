import java.util.Scanner;

public class MultiplicationTablee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        
        int[] multiplicationResult = new int[10]; 
       
        for (int i = 6; i <= 9; i++) {
            System.out.println("Multiplication table of " + i + ":");
            
            for (int j = 1; j <= 10; j++) {
                multiplicationResult[j-1] = i * j;
                System.out.println(i + " * " + j + " = " + multiplicationResult[j-1]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
