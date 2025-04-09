import java.util.Scanner ; 
class oddEvenNumber {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the natural number : " );
		int number = scanner.nextInt();
		
		System.out.println("The Event numbers are : ");
		
		for (int i=0 ; i < number +1 ; i ++){
			
			if (i%2==0){
				System.out.println(i);
			}
		}
		System.out.println("The Odd numbers are : ");

		for (int i=0 ; i < number +1 ; i ++){
			
			if (i%2!=0){
				System.out.println(i);
			}
				
		}
	scanner.close();
	}
}
				
		