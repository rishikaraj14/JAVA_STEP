import java.util.Scanner;

public class ThreeFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Age = new int[3];
        double[] height = new double[3];

        System.out.println("Enter the age of Amar:");
        Age[0] = scanner.nextInt();

        System.out.println("Enter the age of Akbar:");
        Age[1] = scanner.nextInt();

        System.out.println("Enter the age of Anthony:");
        Age[2] = scanner.nextInt();

        System.out.println("Enter the height of Amar:");
        height[0] = scanner.nextDouble();

        System.out.println("Enter the height of Akbar:");
        height[1] = scanner.nextDouble();

        System.out.println("Enter the height of Anthony:");
        height[2] = scanner.nextDouble();

        // Finding the youngest
        if (Age[0] < Age[1] && Age[0] < Age[2]) {
            System.out.println("Amar is the youngest\n");
        } else if (Age[1] < Age[0] && Age[1] < Age[2]) {
            System.out.println("Akbar is the youngest\n");
        } else {
            System.out.println("Anthony is the youngest\n");
        }

        // Finding the tallest
        if (height[0] > height[1] && height[0] > height[2]) {
            System.out.println("Amar is the tallest\n");
        } else if (height[1] > height[0] && height[1] > height[2]) {
            System.out.println("Akbar is the tallest\n");
        } else {
            System.out.println("Anthony is the tallest\n");
        }

        scanner.close();
    }
}

