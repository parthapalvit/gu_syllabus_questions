
// 7 A Java program that calculates the sum of any number of integers entered interactively from the keyboard, where the total number of integers is given as a command line argument //



import java.util.Scanner;

public class IntegerSumCalculator {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the total count of numbers as a command line argument.");
            return;
        }

        int count = Integer.parseInt(args[0]);
        if (count <= 0) {
            System.out.println("Invalid count. Please provide a positive integer.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("The sum is: " + sum);
    }
}
