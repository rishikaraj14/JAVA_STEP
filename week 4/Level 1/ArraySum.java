import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        
        double[] numbers = new double[10];
        double total = 0.0; 
        int index = 0;

        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.print("Enter a number (0 or a negative number to stop): ");
            double userInput = scanner.nextDouble();

            
            if (userInput <= 0 || index == 10) {
                break;
            }

            
            numbers[index] = userInput;
            index++; 
        }

        
        System.out.println("\nThe numbers entered are:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i]; 
        }

        
        System.out.println("\nThe sum of all numbers is: " + total);
        
        scanner.close();
    }
}
