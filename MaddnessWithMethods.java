    // MaddnessWithMethods.java
    // Hope Nanthavongdouangsy 9/2/2025

    // References:
    // This is what I used to learn user input
    // https://www.w3schools.com/java/java_user_input.asp

    // I need to import the Scanner class from the
    // java.util package - this is how I do that.

    import java.util.Scanner;

    public class MaddnessWithMethods {
        public static void main(String[] args) {
            // method = a block of code that is executed whatever it is called upon
            String aName = "Hope";
            helloThere(aName);

            int num1 = 0;
            int sillyName = 0;
            Scanner scanner = new Scanner(System.in);
            // Get first int.
            System.out.print("Enter a integer for num1: ");
            num1 = scanner.nextInt();
            // Get int for sillyName
            System.out.print("Enter a integer for sillyName: ");
            sillyName = scanner.nextInt();
            // Print out the Sum of the two ints
            System.out.println("The sum of these two ints is: " + addTwoInts(num1, sillyName));
        }

        static void helloThere(String aName) {
            System.out.println("Hello " + aName);
        }


        static int addTwoInts(int num1, int sillyName) {
            int result = num1 + sillyName;
            return result;
        }
    }
