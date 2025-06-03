package LearningProjects;

import java.util.Scanner;

public class todoList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the To-Do CLI App");
        String tasks[][] = new String[1][2];

        while(true){
            System.out.println("""
                    --------------------------
                    1. View Tasks
                    2. Add Tasks
                    3. Delete Tasks
                    4. Exit
                    --------------------------
                    """);
            System.out.print("Please Choose An Option From Above : ");
            int userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    // do something
                case 2:
                    //
            }

        }
    }
}
