import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in inches): ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle (in inches): ");
        double height = scanner.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; // 1 square inch = 6.4516 square cm

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square cm.");
        
        scanner.close();
    }
}
