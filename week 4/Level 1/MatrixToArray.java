import java.util.Scanner; 
class MatrixToArray { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
// Take user input for rows and columns 
        System.out.print("Enter number of rows: "); 
        int rows = scanner.nextInt(); 
        System.out.print("Enter number of columns: "); 
        int columns = scanner.nextInt(); 
         
        // Create and populate the 2D array 
        int[][] matrix = new int[rows][columns]; 
        System.out.println("Enter elements of the matrix:"); 
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < columns; j++) { 
                System.out.print("Element [" + i + "][" + j + "]: "); 
                matrix[i][j] = scanner.nextInt(); 
            } 
        } 
         
        // Copy 2D array elements into 1D array 
        int[] array = new int[rows * columns]; 
        int index = 0; 
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < columns; j++) { 
                array[index++] = matrix[i][j]; 
            } 
        } 
         
        // Display the 1D array 
        System.out.print("1D Array: "); 
        for (int num : array) { 
            System.out.print(num + " "); 
        } 
        System.out.println(); 
         
scanner.close(); 
} 
}