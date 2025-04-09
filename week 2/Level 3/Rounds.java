import java.util.Scanner ; 
//Program to find out the number of rounds an athlete has to take to complete 5 Kms 
public class Rounds{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the distance of 1st side of the triangle in meters:");
		double side1 = scanner.nextDouble();
		
		System.out.print("Enter the distance of 2nd side of the triangle in meters:");
		double side2 = scanner.nextDouble();

		System.out.print("Enter the distance of 3rd side of the triangle in meters:");
		double side3 = scanner.nextDouble();

		double perimeter = side1+side2+side3;
		int rounds = (perimeter / 5) ;
		
		System.out.print("The total Number of rounds the athlete will run is " +rounds+" to compelete 5km" );
		scanner.close();
	}
}
