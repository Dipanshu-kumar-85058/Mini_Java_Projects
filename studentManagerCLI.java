package LearningProjects.StudentManager;

import java.sql.SQLOutput;
import java.util.Scanner;

public class studentManagerCLI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[100];
        int[] rollNumbers = new int[100];
        float[] marks = new float[100];
        int studentCount = 0;

        System.out.println("Welcome To Our Student Managing App ");
        while(true) {
            System.out.println("""
                    ---------------------------------------
                    How Can We Help You :
                    1. Register a New Student
                    2. View All Students
                    3. Find Student By Roll Number
                    4. Exit
                    """);
            System.out.print("Please Choose an Option : ");
            int userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput) {
                case 1:
                    System.out.println("Please Enter The Details Of The Student Below :");

                    System.out.print("Name of the Student : ");
                    names[studentCount] = scanner.nextLine();

                    System.out.print("Roll Number of the Student : ");
                    rollNumbers[studentCount] = scanner.nextInt();

                    System.out.print("Marks of the Student : ");
                    marks[studentCount] = scanner.nextFloat();

                    studentCount++;

                    break;

                case 2:
                    System.out.println("All The Registered Students Are :");
                    System.out.println("Name\t\tRoll No.\tMarks ");
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println(names[i] + "\t" + rollNumbers[i] + "\t\t" + marks[i]);
                    }
                    break;

                case 3:
                    boolean found = false;
                    System.out.print("Please Enter The Roll Number : ");
                    int findStudent = scanner.nextInt();
                    for (int i = 0; i < studentCount; i++) {
                        if (findStudent == rollNumbers[i]) {
                            System.out.println("student Found!!");
                            System.out.println("Name : " + names[i] + " |  Roll Number : " + rollNumbers[i] + " |  Marks : " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("No Student Found for Roll Number " + findStudent + " Please Use a Valid roll number");
                    }
                    break;

                case 4:
                    System.out.println("Thank You For Using Our CLI Student Manager App!!");
                    return;

                default:
                    System.out.println("Please Choose a Valid Option!!");
            }
            if (studentCount >= 100) {
                System.out.println("Student list is full!");
                break;
            }
        }
    }
}
