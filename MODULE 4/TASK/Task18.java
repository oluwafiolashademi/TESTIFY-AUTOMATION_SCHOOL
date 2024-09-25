import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        //Write a code that asks the user for age and that accepts the Integer value.
        // Handle the error that is encountered
        // when the users tries to enter a name instead of age
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter your age: ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for your age.");
            }
        }

        System.out.println("Your age is: " + age);
        scanner.close(); // Close the scanner
    }
}
