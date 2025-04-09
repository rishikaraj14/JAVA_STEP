import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of students
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        // 2D array to store marks for Physics, Chemistry, and Math
        int[][] marks = new int[numberOfStudents][3]; // [][0] = Physics, [][1] = Chemistry, [][2] = Math
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            // Input validation for marks (0 to 100)
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Math";
                do {
                    System.out.print(subject + " marks: ");
                    marks[i][j] = scanner.nextInt();

                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
        }

        // Calculating percentages and assigning grades
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100; // Assuming max marks = 300

            // Assigning grades based on percentage
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Displaying the results
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Math", "Percentage", "Grade");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10c%n",
                    (i + 1),
                    marks[i][0], marks[i][1], marks[i][2],
                    percentages[i],
                    grades[i]);
        }

        scanner.close();
    }
}
