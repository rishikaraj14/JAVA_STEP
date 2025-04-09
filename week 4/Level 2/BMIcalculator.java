import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Enter the number of persons:");
        int number = scanner.nextInt();

        
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        
        for (int i = 0; i < number; i++) {
            double weight, height;

            
            do {
                System.out.println("Enter the weight of person " + (i + 1) + " (in kg):");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (weight <= 0);

            
            do {
                System.out.println("Enter the height of person " + (i + 1) + " (in meters):");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (height <= 0);

            
            personData[i][0] = weight;
            personData[i][1] = height;

            
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            
            if (bmi <= 18.4) {
                weightStatus[i] = "UNDERWEIGHT";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "NORMAL";
            } else if (bmi >= 25 && bmi <= 29.9) {
                weightStatus[i] = "OVERWEIGHT";
            } else if (bmi >= 30) {
                weightStatus[i] = "OBESE";
            } else {
                weightStatus[i] = "INVALID";
            }
        }


        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Person", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10s%n",
                    (i + 1),
                    personData[i][0],   // Weight
                    personData[i][1],   // Height
                    personData[i][2],   // BMI
                    weightStatus[i]);   // Weight Status
        }

        scanner.close();
    }
}
