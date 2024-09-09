import java.util.Scanner;

public class TASK9B {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equalsIgnoreCase("testify")) {
            System.out.println("Hi user! Input a word for your user logic: ");
            userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("testify")) {
                System.out.println("try again");
            }
        }
        System.out.println("You entered 'testify'! You are welcome.");
    }
}