import java.util.Scanner;
class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        double heightInches = heightCm / 2.54;
        int heightFeet = (int) (heightInches / 12);
        double remainingInches = heightInches % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + remainingInches);
        input.close();
    }
}