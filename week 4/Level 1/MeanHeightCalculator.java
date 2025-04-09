import java.util.Scanner; 
class MeanHeightCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        // Define an array to store the heights of 11 players 
        double[] heights = new double[11]; 
        double sum = 0.0; 
         
        // Taking user input for heights 
        for (int i = 0; i < heights.length; i++) { 
            System.out.print("Enter height of player " + (i + 1) + ": "); 
            heights[i] = scanner.nextDouble(); 
            sum += heights[i]; 
        } 
         
        // Calculate mean height 
        double mean = sum / heights.length; 
         
        // Display the mean height 
        System.out.println("The mean height of the football team is: " + mean); 
         
        scanner.close(); 
    } 
} 