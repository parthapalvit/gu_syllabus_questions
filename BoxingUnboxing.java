// 14.  


// A class to demonstrate the concept of boxing and unboxing
public class BoxingUnboxing {
    public static void main(String[] args) {
      // Declare a primitive data type variable and assign it a value
      int x = 10;
      // Box the primitive data type variable into an object of the corresponding wrapper class
      Integer y = x; // Autoboxing
      // Display the values of the primitive data type variable and the wrapper class object
      System.out.println("The value of x is " + x);
      System.out.println("The value of y is " + y);
      // Unbox the wrapper class object into a primitive data type variable
      int z = y; // Auto-unboxing
      // Display the value of the unboxed variable
      System.out.println("The value of z is " + z);
    }
  }
  