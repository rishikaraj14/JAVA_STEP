import java.util.Scanner;

class springSeason { 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month: ");
        int month = input.nextInt();

        System.out.println("Enter the day: ");
        int day = input.nextInt();
        if ((month == 3 && day >= 20 && day <= 31) ||  
            (month == 4 && day >= 1 && day <= 30)  ||  
            (month == 5 && day >= 1 && day <= 31)  ||  
            (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("It's a Spring Season!");
        } else {
            System.out.println("It's not a Spring Season.");
        }

        input.close();
    }
}
