import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user inputs
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your starting city: ");
        String fromCity = scanner.nextLine();
        
        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();
        
        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();
        
        System.out.print("Enter the distance from start city to via city (in miles): ");
        double fromToVia = scanner.nextDouble();
        
        System.out.print("Enter the distance from via city to destination city (in miles): ");
        double viaToFinalCity = scanner.nextDouble();
        
        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();
        
        // Calculating total distance
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;
        
        // Taking user inputs for fee and discount percent
        System.out.print("Enter the travel fee: ");
        double fee = scanner.nextDouble();
        
        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();
        
        // Calculating discount and final price
        double discountAmount = (fee * discountPercent) / 100;
        double finalAmount = fee - discountAmount;
        
        // Displaying results
        System.out.println("Traveler Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + averageSpeed + " mph");
        System.out.println("Original Fee: INR " + fee);
        System.out.println("Discount Amount: INR " + discountAmount);
        System.out.println("Final Amount after Discount: INR " + finalAmount);
        
        // Closing the scanner
        scanner.close();
    }

} 
		