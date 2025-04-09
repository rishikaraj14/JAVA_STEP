import java.util.Scanner ;
 
class tableNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int Num = input.nextInt();
		if (Num!=0){

			for (int i=6;i < 10 ; i++){
				System.out.println("NUMBER x " +i+" = "+ Num*i);			}
		}
		else{
			System.out.println("NUMBER x 0 = "+ "0");
		}
	input.close();
	}
}