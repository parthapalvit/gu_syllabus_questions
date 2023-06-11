
// 8. A Java program that demonstrates the usage of various functions of the String class and the StringBufferclass like setCharAt(), setLenght(), appendI(), insert(), concat()  and equals  //

public class StringFunctionsDemo {
    public static void main(String[] args) {
        // String class functions
        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        // charAt() - Returns the character at the specified index
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);

        // length() - Returns the length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // substring() - Returns a substring of the original string
        String substring = str.substring(7, 12);
        System.out.println("Substring from index 7 to 11: " + substring);

        // indexOf() - Returns the index of the specified character or substring
        int index = str.indexOf('W');
        System.out.println("Index of 'W': " + index);

        // replace() - Replaces occurrences of a specified character or substring
        String replacedString = str.replace('o', 'a');
        System.out.println("String with 'o' replaced by 'a': " + replacedString);

        // StringBuffer class functions
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");
        System.out.println("\nOriginal StringBuffer: " + stringBuffer);

        // setCharAt() - Sets the character at the specified index
        stringBuffer.setCharAt(7, 'M');
        System.out.println("After setting character at index 7: " + stringBuffer);

        // setLength() - Sets the length of the StringBuffer
        stringBuffer.setLength(5);
        System.out.println("After setting length to 5: " + stringBuffer);

        // append() - Appends a string representation of the argument to the StringBuffer
        stringBuffer.append(" Welcome!");
        System.out.println("After appending: " + stringBuffer);

        // insert() - Inserts the string representation of the argument at the specified index
        stringBuffer.insert(5, "Awesome ");
        System.out.println("After inserting at index 5: " + stringBuffer);

        // concat() - Concatenates the specified string to the end of the StringBuffer
        stringBuffer = stringBuffer.concat(" Have a nice day!");
        System.out.println("After concatenating: " + stringBuffer);

        // equals() - Compares the contents of two StringBuffers for equality
        StringBuffer otherBuffer = new StringBuffer("Hello, World! Have a nice day!");
        boolean isEqual = stringBuffer.equals(otherBuffer);
        System.out.println("StringBuffers are equal: " + isEqual);
    }
}
