import java.util.Scanner;

class NumberCheck {
	public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] number = new int[5];

	for (int i=0 ; i < number.length ; i++) {
		System.out.print("Enter number " + (i+1) + ":");
		number[i] = scanner.nextInt();
	}
	
	for(int i = 0 ; i < number.length ; i++){
		if (number[i] > 0 ) {
			System.out.print("Number " + number[i] + "is positive and ");
			if (number[i] % 2 == 0) {
				System.out.print("even");
			} else {
				System.out.println("Odd.");
			}
		} else if (number[i] < 0){
			System.out.println("Number" + number[i] + "is negative.");
		} else {
			System.out.print("Number " + number[i] + "is zero.");
			}
		}
		
		if (number[0] == number[4]) { 
			System.out.print("First and Last elements are equal.");
		} else if(number[0] > number[4]) {
			System.out.println("First element is less than last.");
		}
		scanner.close();
	}
}