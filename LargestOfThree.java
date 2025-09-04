// LargestOfThree.java
// Hope Nanthavongdouangsy 8/19/2025

// References:
// This is what I used to learn user input
// https://www.w3schools.com/java/java_user_input.asp

// Description of program
// this program will input three ints from the user.
// Processing will be the finding the largest of the three numbers with nested if statements.
// output will be a understandable statement of the largest number.
// Example: You input the value of 55 for input num2 and that was the largest number.

// I need to import the Scanner class from the
// java.util package - this is how I do that.
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to the largest number of user program...\n");
        // Get 3 ints from the user and output the sum of ints.

        // Create the variables needed
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;
        // get user input
        // Create a Scanner object named scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user for the first int.
        System.out.println("\n Please enter a whole number for num1: ");
        num1 = scanner.nextInt();
        // output the user's input to make sure my program is working.
        System.out.println("\n The user entered " + num1 + " for num1");
        // prompt user for the second int.
        System.out.println("\n Please enter a whole number for num2: ");
        num2 = scanner.nextInt();
        // output the user's input to make sure my program is working.
        System.out.println("\n The user entered " + num2 + " for num2");
        // prompt user for the third int.
        System.out.println("\n Please enter a whole number for num3: ");
        num3 = scanner.nextInt();
        // output the user's input to make sure my program is working.
        System.out.println("\n The user entered " + num3 + " for num3");

        // processing
        // Use nested if statement to find largest.
        if (num1 > num2) {
            if (num1 > num3) {
                // this is the true part
                largest = num1;
            } else {
                // this is the false part
                largest = num3;
            }
        }
       else {
        if (num2 > num3) {
            // this is the true part
            largest = num2;
        } else {
            // this is the false part
            largest = num3;
        }
    }

            // Output meaningful information to the user
                System.out.println("\n You entered " + num1 + "for the value of num1.\n");
                System.out.println("\n You entered " + num2 + "for the value of num2.\n");
                System.out.println("\n You entered " + num3 + "for the value of num3.\n");

                System.out.println("\n The largest number is " + largest);

            }
        }

