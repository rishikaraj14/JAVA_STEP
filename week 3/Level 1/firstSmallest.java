import java.util.Scanner ;

class firstSmallest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number1 : ");
		int number1 = input.nextInt();

		System.out.print("Enter the number2 :");
		int number2 = input.nextInt();

		System.out.print("Enter the number3 : ");
		int number3 = input.nextInt();

		System.out.print("Is the first number the smallest ?");
		if  ( number1 < number3 && number1 < number2 ) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
		input.close();
	}
}