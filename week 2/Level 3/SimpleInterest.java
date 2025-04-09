import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("The Principal = ");
		double Principal = scanner.nextDouble();

		System.out.print("The Rate = ");
		double Rate = scanner.nextDouble();

		System.out.print("The Time in years = ");
		double Time = scanner.nextDouble();

	
		double SimpleInterest = (Principal * Rate * Time ) / 100 ;

		System.out.print("The Simple Interest is " + SimpleInterest + " for Principal " + Principal +" Rate of Interest " + Rate + " and Time "+ Time +".");
		scanner.close();
	}
}
