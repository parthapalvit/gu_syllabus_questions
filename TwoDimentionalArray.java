//4. 


import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the array: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns in the array: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the element at row " + i + ", column " + j + ": ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The number of rows in the array is " + array.length);
        System.out.println("The number of columns in the array is " + array[0].length);

        System.out.println("The elements of the array are: ");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
