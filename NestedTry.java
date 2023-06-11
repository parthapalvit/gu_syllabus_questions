



// 19. A class to show the use of nested try statements
public class NestedTry {
    public static void main(String[] args) {
      // Try to execute some statements that may cause exceptions
      try {
        // Declare an array of three elements
        int[] arr = new int[3];
        // Try to assign a value to the fourth element of the array
        try {
          arr[3] = 10;
        }
        // Catch the array index out of bounds exception
        catch (ArrayIndexOutOfBoundsException e) {
          // Display a message
          System.out.println("Array index out of bounds");
        }
        // Try to divide the first element of the array by zero
        try {
          int result = arr[0] / 0;
        }
        // Catch the arithmetic exception
        catch (ArithmeticException e) {
          // Display a message
          System.out.println("Cannot divide by zero");
        }
      }
      // Catch any other exception that may occur
      catch (Exception e) {
        // Display a message
        System.out.println("Some other exception occurred");
      }
    }
  }
  