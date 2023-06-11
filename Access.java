// 12. write a java programme to show the differences between public and private access specifiers . 
//the program should be also show that primitive data types are passed by value and objects are passed by  reference and to learn the use of final keyword. //




// A class to demonstrate the differences between public and private access specifiers
class Access {
    // A private instance variable
    private int x;
  
    // A public instance variable
    public int y;
  
    // A constructor to assign values to the instance variables
    public Access(int x, int y) {
      this.x = x;
      this.y = y;
    }
  
    // A method to display the values of the instance variables
    public void display() {
      System.out.println("The value of x is " + x);
      System.out.println("The value of y is " + y);
    }
  
    // A method to swap the values of the instance variables
    public void swap() {
      int temp = x;
      x = y;
      y = temp;
    }
  }
  
  // A class to demonstrate that primitive data types are passed by value and objects are passed by reference
  class Pass {
    // A method to increment a primitive data type
    public void increment(int a) {
      a++;
      System.out.println("The value of a inside the method is " + a);
    }
  
    // A method to increment an object's instance variable
    public void increment(Access obj) {
      obj.y++;
      System.out.println("The value of obj.y inside the method is " + obj.y);
    }
  }
  
  // A class to test the Access and Pass classes
  public class TestAccessPass {
    public static void main(String[] args) {
      // Create an access object with values 10 and 20
      Access a1 = new Access(10, 20);
      // Display the values of the instance variables
      a1.display();
      // Try to access the private instance variable x directly
      // This will cause a compilation error as x is not visible outside the class
      // System.out.println(a1.x);
      // Try to access the public instance variable y directly
      // This will work as y is visible outside the class
      System.out.println(a1.y);
      // Swap the values of the instance variables using the swap method
      a1.swap();
      // Display the values of the instance variables after swapping
      a1.display();
  
      // Create a pass object
      Pass p = new Pass();
      // Declare a primitive data type variable and assign it a value
      int b = 10;
      System.out.println("The value of b before calling the method is " + b);
      // Call the increment method with the primitive data type variable as argument
      p.increment(b);
      // Display the value of b after calling the method
      System.out.println("The value of b after calling the method is " + b);
      // The value of b will not change as primitive data types are passed by value
  
      // Declare an object variable and assign it an access object with values 30 and 40
      Access a2 = new Access(30, 40);
      System.out.println("The value of a2.y before calling the method is " + a2.y);
      // Call the increment method with the object variable as argument
      p.increment(a2);
      // Display the value of a2.y after calling the method
      System.out.println("The value of a2.y after calling the method is " + a2.y);
      
      // The value of a2.y will change as objects are passed by reference
  
      // Declare a final primitive data type variable and assign it a value
      final int c = 50;
      
      // Try to change the value of c
      // This will cause a compilation error as final variables cannot be modified once assigned
      // c = 60;
      
       }
  }
  