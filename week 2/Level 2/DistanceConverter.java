import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInFeet / 5280; // 1 mile = 5280 feet

        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles.");
        
        scanner.close();
    }
}
