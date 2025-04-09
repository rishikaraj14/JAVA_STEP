import java.util.Scanner;
class UserFeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Student Fee: ");
        double studentFee = input.nextDouble();
        System.out.print("Enter the University Discount Percentage: ");
        double userDiscountPercent = input.nextDouble();
        double userDiscount = (studentFee * userDiscountPercent) / 100.0;
        double userFinalFee = studentFee - userDiscount;
        System.out.println("The discount amount is INR " + userDiscount + " and final discounted fee is INR " + userFinalFee);
        input.close();
    }
}