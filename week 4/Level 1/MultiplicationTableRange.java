import java.util.Scanner; 
class MultiplicationTableRange { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        // Get user input 
        System.out.print("Enter a number: "); 
        int number = scanner.nextInt(); 
         
        // Define an array to store the results 
        int[] multiplicationResult = new int[4]; 
         
        // Compute multiplication table from 6 to 9 
        for (int i = 6; i <= 9; i++) { 
            multiplicationResult[i - 6] = number * i; 
        } 
         
        // Display the results 
        for (int i = 6; i <= 9; i++) { 
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]); 
        } 
         
        scanner.close(); 
    } 
} 