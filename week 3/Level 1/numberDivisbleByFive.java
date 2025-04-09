import java.util.Scanner ; 

class numberDivisbleByFive {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number you have to check : ");
		int num = input.nextInt() ; 
		if (num%5==0) {
			System.out.println("The number" + num + " is divisible by 5 ") ;
		}
		else {
		 System.out.println("The number " + num + " is noty divisible by 5") ; 
		}
		input.close();
	}
}