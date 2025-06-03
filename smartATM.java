package LearningProjects;

import java.util.Scanner;

public class smartATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 1000;
        int withdrawAmount;
        int depositAmount;

        System.out.println("Welcome to the CLI ATM");

        while (true){

            System.out.println("""
                    ----------------------
                    1. Check Balance
                    2. Deposit Money
                    3. Withdraw Money
                    4. Exit
                    ----------------------
                    """);

            System.out.print("Please Choose a Valid Option : ");
            int userInput = scanner.nextInt();

            if(userInput == 1){
                System.out.println("Your Current Account Balance Is : ₹" + balance);
            }
            else if (userInput == 2) {
                System.out.print("Enter That You Want To Deposit : ₹");
                depositAmount = scanner.nextInt();

                if (depositAmount < 0){
                    System.out.print("The Entered Amount Is Invalid !!");
                }
                else {
                    balance += depositAmount;
                    System.out.println("The Amount Is Successfully Deposited !!");
                }
            }
            else if (userInput == 3) {
                System.out.print("Enter That You Want To Withdraw : ₹");
                withdrawAmount = scanner.nextInt();

                if (withdrawAmount > 0 && withdrawAmount <= balance){
                    balance -= withdrawAmount;
                    System.out.println("The Amount Is Successfully Withdrew !!");
                }
                else {
                    System.out.println("Insufficient Amount or Invalid Amount !!");
                }
            }
            else if (userInput == 4) {
                System.out.println("Thank You For Using Our SmartATM !!");
                return;
            }
            else {
                System.out.println("Please Enter a Valid Option !!");
            }
        }
    }
}
