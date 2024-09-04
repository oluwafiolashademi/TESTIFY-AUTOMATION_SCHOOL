import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Build a Simple interest calculator.Write a program to
        // ask the user for the necessary field you need in calculating the simple interest
        // and then communicate the simple interest back to the user is a good sentence
        Scanner interestCalculator = new Scanner(System.in);
        System.out.println("Hi user!, Welcome to our Simple Interest Calculator");

        System.out.println("Enter your principal Amount: ");
        Double principal = interestCalculator.nextDouble();

        System.out.println("Enter your interest rate in %: ");
        Double interestRate = interestCalculator.nextDouble();

        System.out.println("Enter your term in years: ");
        Double term = interestCalculator.nextDouble();

        //To calculate the Total
        double TotalInterest = (principal * interestRate * term) / 100;
        System.out.println("The Total Interest rate is " + TotalInterest);
    }
}
