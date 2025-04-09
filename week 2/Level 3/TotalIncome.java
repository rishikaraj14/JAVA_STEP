//Create a program to find the total income of a person by taking salary and bonus from user
import java.util.Scanner;
public class TotalIncome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("The Salary of the person:");
		int salary = scanner.nextInt();
		System.out.print("The bonus of the person:");
		int bonus = scanner.nextInt();
		int TotalIncome= salary + bonus;
		System.out.print("The salary is INR"+ salary + "and bonus is INR" + bonus+ "Hence Total Income is INR"+TotalIncome);
		scanner.close();
	}
}