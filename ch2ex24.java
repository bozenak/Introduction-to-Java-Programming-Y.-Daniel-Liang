import java.util.Scanner;

//Financial application monetary units
/*
Rewrite Listing 2.10, ComputeChange.java,
to fix the possible loss of accuracy when converting a double value to an
int value. Enter the input as an integer whose last two digits represent the cents.
For example, the input 1156 represents 11 dollars and 56 cents.
 */
public class ch2ex24 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.println("Enter amount in integer: ");
        int amount = input.nextInt();

        int dollars = amount / 100;
        int cents = amount % 100;

        System.out.println("Your amount consist of: " + dollars + " dollars" +
                " and " + cents + " cents");

        // Find the number of one dollars



    }
}

