import java.util.Scanner;

class ageToVote {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Age of the person : ");
		int age = scanner.nextInt();

		if (age >=18) {
			System.out.print("The person's age is " + age + " and can vote");
		}
		else {
		   	System.out.print("The person's age is " + age + " and cannot vote");
		}
		scanner.close();
	}
}