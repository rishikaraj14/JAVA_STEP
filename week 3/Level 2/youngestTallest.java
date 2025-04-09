import java.util.Scanner;

class youngestTallest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the age of Amar:");
        int Age1 = scanner.nextInt();
        System.out.println("Enter the height of Amar (in cm):");
        int height1 = scanner.nextInt();
    
        System.out.println("Enter the age of Akbar:");
        int Age2 = scanner.nextInt();
        System.out.println("Enter the height of Akbar (in cm):");
        int height2 = scanner.nextInt();

        System.out.println("Enter the age of Anthony:");
        int Age3 = scanner.nextInt();
        System.out.println("Enter the height of Anthony (in cm):");
        int height3 = scanner.nextInt();
        
        // Finding the youngest
        if (Age1 < Age2 && Age1 < Age3) {
            System.out.println("Amar is the youngest.");
        } else if (Age2 < Age1 && Age2 < Age3) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Correcting the tallest comparison
        if (height1 > height2 && height1 > height3) {
            System.out.println("Amar is the tallest.");
        } else if (height2 > height1 && height2 > height3) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }

        scanner.close();
    }
}

		
		
		