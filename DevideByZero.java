


// 18. A class to demonstrate the arithmetic exception when dividing by zero
import java.util.Scanner; // Import the scanner package
public class DivideByZero {
  public static void main(String[] args) {
    // Create a scanner object to read the user input
    Scanner sc = new Scanner(System.in);
    // Prompt the user to enter two numbers
    System.out.println("Enter two numbers: ");
    // Read the numbers and store them in int variables
    int a = sc.nextInt();
    int b = sc.nextInt();
    // Close the scanner object
    sc.close();
    // Try to divide the first number by the second number
    try {
      int result = a / b;
      // Display the result
      System.out.println("The result of " + a + " / " + b + " is " + result);
    }
    // Catch the arithmetic exception if the second number is zero
    catch (ArithmeticException e) {
      // Display a message
      System.out.println("Cannot divide by zero");
    }
  }
}
