
// 13.  A java program to show use of static functions and to pass variable length arguments in a function



// A class to demonstrate the use of static functions and variable length arguments
class StaticVarargs {
    // A static variable to count the number of objects created
    private static int count = 0;
  
    // A constructor to increment the count variable
    public StaticVarargs() {
      count++;
    }
  
    // A static method to display the count variable
    public static void displayCount() {
      System.out.println("The number of objects created is " + count);
    }
  
    // A static method to add variable length arguments
    public static int add(int... args) {
      // Initialize a sum variable
      int sum = 0;
      // Loop through the arguments and add them to the sum
      for (int arg : args) {
        sum += arg;
      }
      // Return the sum
      return sum;
    }
  }
  
  // A class to test the StaticVarargs class
  public class TestStaticVarargs {
    public static void main(String[] args) {
      // Call the displayCount method without creating any object
      StaticVarargs.displayCount();
      // Create three objects of the StaticVarargs class
      StaticVarargs s1 = new StaticVarargs();
      StaticVarargs s2 = new StaticVarargs();
      StaticVarargs s3 = new StaticVarargs();
      // Call the displayCount method again
      StaticVarargs.displayCount();
      // Call the add method with different number of arguments
      System.out.println("The sum of no arguments is " + StaticVarargs.add());
      System.out.println("The sum of two arguments is " + StaticVarargs.add(10, 20));
      System.out.println("The sum of four arguments is " + StaticVarargs.add(10, 20, 30, 40));
    }
  }
  