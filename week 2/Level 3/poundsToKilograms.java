import java.util.Scanner;
public class poundsToKilograms {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the weight of the person in Pounds : ");
		double Pounds = scanner.nextDouble();
		
		double weightInKilograms = (Pounds * 2.2);
		
		System.out.print("The weight of the person in pound is "+ Pounds + "and in kg is " +  weightInKilograms );
		scanner.close();
	}
}