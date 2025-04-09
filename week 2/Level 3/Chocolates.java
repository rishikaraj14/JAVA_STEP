import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter the number of Chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of Children: ");
        int numberOfChildren = scanner.nextInt();

        // Logic to distribute chocolates
        int chocolatesEachChildGets = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output the results
        System.out.println("Each child gets " + chocolatesEachChildGets + " chocolates.");
        System.out.println("The remaining chocolates are " + remainingChocolates + ".");

        scanner.close();
    }
}
