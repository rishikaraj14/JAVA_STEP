//Create a program to swap two numbers
import java.util.Scanner;
public class SwapNumbers {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int number1 = scanner.nextInt();
	System.out.print("Enter the second number: ");
	int number2 = scanner.nextInt();
//Swapping logic 
	int temp = number1;
	number1 = number2;
	number2 = temp;
	System.out.print("The sawpped numbers are "+ number1 +" and "+ number2);
	scanner.close();
	}
}