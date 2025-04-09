//to find out the maximum number of handshakes among the students 
import java.util.Scanner; 
public class handShakes {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("The number of students : ");	
		int numberOfStudents = scanner.nextInt();

		int maxNumberOfHandshakes = ( numberOfStudents * (numberOfStudents -1)) / 2 ; 
		
		System.out.print("The Maximum number of handshakes that's possible = " + maxNumberOfHandshakes);
		scanner.close();
	}
}