import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();

             for (int i = counter; i > 0; i--) {
            System.out.println(i);  
	}
	scanner.close(); 
    }
}    
