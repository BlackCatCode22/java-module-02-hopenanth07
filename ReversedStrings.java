// ReversedStrings.java
// Hope Nanthavongdouangsy 9/2/2025

// References:
// This is what I used to learn user input
// https://www.w3schools.com/java/java_user_input.asp
// https://www.w3schools.com/java/java_howto_reverse_string.asp

// I need to import the Scanner class from the
// java.util package - this is how I do that.

import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the string from user
        System.out.println("Enter a string: ");
        String word = scanner.nextLine();
        String reversedString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString += word.charAt(i);
        }
        // Print out the reversed String
        System.out.println(reversedString);
    }
}