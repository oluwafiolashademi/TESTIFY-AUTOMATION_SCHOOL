import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
        Create a method that verify that visitors on the Slack channel are coming for testify Trainings.
         If they write" Testify" then print out a  welcome message
         if not , the user should be shown rejection message.
         after creating this method,then invoke the created method in your main method
         Task10 task = new Task10();
         task.verifyVisitor();
        */
        verifyVisitor();

    }
    public static void verifyVisitor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to this Slack channel! kindly input is \"Testify\" if you are coming for testify Trainings");

        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("Testify")) {
            System.out.println("You are welcome to the Testify Trainings.");
        } else {
            System.out.println("Rejection: You are not here for Testify Trainings.");
        }
    }
}
