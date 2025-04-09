import java.util.Scanner; 

class  checkNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number you want to check : ");
		int number = scanner.nextInt();

		if (number == 0){
				System.out.println("The number " + number + " is zero ");
		}
		else if (number > 0) {
				System.out.println("The number " + number + " is positive ");
		}
		else {
			System.out.println("The number " + number + " is negative ");
		}
	scanner.close();
	}
}
			
	