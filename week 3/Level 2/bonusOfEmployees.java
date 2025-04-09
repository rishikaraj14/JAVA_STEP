import java.util.Scanner;

class bonusOfEmployees{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Enter the year of service of the employee : ");
		int Year = scanner.nextInt();

		
		System.out.println("Enter the Salary of the employee : ");
		int Salary = scanner.nextInt();
	

		
		if ( Year>=5 ){
			double Bonus = Salary* 5/100  ;
			System.out.println("The bonus amount is :  "+ Bonus );
		}
		else {
		
			System.out.println("Sorry No bonus.");
		}
		scanner.close();
	}
}

			
