//Create a program to compute the temperature into Fahrenheit 

import java.util.Scanner;
public class TemperatureConversion{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the Temperature in Celsius: ");
	double celsius = scanner.nextDouble();
	double farenheitResult = (celsius*9/5) + 32 ;
	System.out.print("The " + celsius + "celsius is "+ farenheitResult + " fahrenheit"  );
	scanner.close();
	}
}