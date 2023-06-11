
// write a java programme to find the sum of integers entered as commaned line argumengts 


public class SumCalculator {
    public static void main(String[] args) {
        int sum = 0;
        
        // Check if there are any command line arguments
        if (args.length > 0) {
            // Iterate through each command line argument
            for (String arg : args) {
                try {
                    // Parse the argument as an integer and add it to the sum
                    int num = Integer.parseInt(arg);
                    sum += num;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid argument: " + arg);
                    System.exit(1);
                }
            }
            
            // Print the sum
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("No arguments provided.");
        }
    }
}
