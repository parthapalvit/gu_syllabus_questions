


//20. A class to create a custom exception type
class MyException extends Exception {
    // A constructor to initialize the exception message
    public MyException(String message) {
      // Call the superclass constructor with the message
      super(message);
    }
  }
  
  // A class to demonstrate the use of the custom exception type
  public class TestMyException {
    public static void main(String[] args) {
      // Try to execute some statements that may cause the custom exception
      try {
        // Declare a variable and assign it a value
        int x = 10;
        // Check if the value is negative
        if (x < 0) {
          // Throw the custom exception with a message
          throw new MyException("Negative value not allowed");
        }
        // Display the value
        System.out.println("The value of x is " + x);
      }
      // Catch the custom exception
      catch (MyException e) {
        // Display the exception message
        System.out.println(e.getMessage());
      }
    }
  }
  