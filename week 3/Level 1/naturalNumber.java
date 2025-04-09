import java.util.Scanner; 
class naturalNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int number= input.nextInt();

		if (number > 0) {
			int sum = number * (number + 1) / 2 ;
				System.out.println("The sum of the natural number" + number + " is : " + sum);
		}
		else {
			System.out.print("The number " + number + "is not a natural Number ");
		}
	input.close();
	}
}