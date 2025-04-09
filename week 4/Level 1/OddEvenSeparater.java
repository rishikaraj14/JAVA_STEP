import java.util.Scanner; 
class OddEvenSeparater { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        // Get user input 
        System.out.print("Enter a natural number: "); 
        int number = scanner.nextInt(); 
         
        if (number < 1) { 
            System.out.println("Error: Please enter a natural number (1 or greater)."); 
            scanner.close(); 
            return; 
        } 
         
        // Define arrays for odd and even numbers 
        int[] evenNumbers = new int[number / 2 + 1]; 
        int[] oddNumbers = new int[number / 2 + 1]; 
        int evenIndex = 0, oddIndex = 0; 
         
        // Separate odd and even numbers 
        for (int i = 1; i <= number; i++) { 
            if (i % 2 == 0) { 
                evenNumbers[evenIndex++] = i; 
            } else { 
                oddNumbers[oddIndex++] = i; 
            } 
        } 
         
        // Print odd numbers 
        System.out.print("Odd numbers: "); 
        for (int i = 0; i < oddIndex; i++) { 
            System.out.print(oddNumbers[i] + " "); 
        } 
        System.out.println(); 
         
        // Print even numbers 
        System.out.print("Even numbers: "); 
        for (int i = 0; i < evenIndex; i++) { 
            System.out.print(evenNumbers[i] + " "); 
        } 
        System.out.println(); 
         
        scanner.close(); 
    } 
} 