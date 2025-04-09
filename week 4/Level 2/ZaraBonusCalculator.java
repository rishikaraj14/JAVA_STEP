import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NUM_EMP = 10;
        double[] salaries = new double[NUM_EMP];
        double[] yearsOfService = new double[NUM_EMP];
        double[] bonuses = new double[NUM_EMP];
        double[] newSalaries = new double[NUM_EMP];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < NUM_EMP; ) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary. Please enter a positive number.");
                continue;
            }

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            double years = scanner.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service. Please enter a non-negative number.");
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years; 
            i++; 
        }

        for (int i = 0; i < NUM_EMP; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nTHE OUTPUT:");
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
