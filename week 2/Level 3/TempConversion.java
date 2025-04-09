// Create a program to convert the temperature from Fahrenheit to Celsius
import java.util.Scanner;
public class TempConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Temperature in Fahrenheit :");
		double fahrenheit = scanner.nextDouble();
		double celsiusResult= (fahrenheit - 32) * 5/9 ;
		System.out.print("The"+fahrenheit + "Fahrenheit is "+ celsiusResult +"celsius" );
		scanner.close();
	}
}