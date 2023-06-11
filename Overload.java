// 11. WRITE A java programme to show that  during function overloading , if no matching argument is found , then then java will apply automatic type conversion ( from lower to highr  data type)




// A class to demonstrate function overloading
class Overload {
  // A method to add two integers
  public void add(int a, int b) {
    System.out.println("The sum of two integers is " + (a + b));
  }

  // A method to add two doubles
  public void add(double a, double b) {
    System.out.println("The sum of two doubles is " + (a + b));
  }
}

// A class to test the Overload class
public class TestOverload {
  public static void main(String[] args) {
    // Create an overload object
    Overload o = new Overload();
    // Call the add method with two integers
    o.add(10, 20);
    // Call the add method with two doubles
    o.add(10.5,20.5);
    // Call the add method with one integer and one double
    o.add(10, 20.5);
    // This will invoke the add(double, double) method as Java will automatically convert the integer to double (from lower to higher data type)
  }
}
