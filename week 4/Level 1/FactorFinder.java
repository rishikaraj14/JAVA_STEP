import java.util.Scanner; 
import java.util.Arrays; 
class FactorFinder { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        // Get user input 
        System.out.print("Enter a number: "); 
        int number = scanner.nextInt(); 
         
        int maxFactor = 10; 
        int[] factors = new int[maxFactor]; 
        int index = 0; 
         
        // Find factors 
        for (int i = 1; i <= number; i++) { 
            if (number % i == 0) { 
                if (index == maxFactor) { 
                    // Increase array size 
                    maxFactor *= 2; 
                    factors = Arrays.copyOf(factors, maxFactor); 
                } 
                factors[index++] = i; 
            } 
        } 
         
        // Display factors 
        System.out.print("Factors of " + number + ": "); 
        for (int i = 0; i < index; i++) { 
            System.out.print(factors[i] + " "); 
        } 
        System.out.println(); 
         
        scanner.close(); 
} 
}