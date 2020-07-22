import java.util.Scanner;

/*
Write a program that prompts the user to enter two numbers.
The numbers should be added and their sum displayed.
The user should be asked if the operation should be perform again.
If so, the loop should repeat, otherwise loop should terminate.

example:
Enter a number: 2
Enter a number: 4
Their sum is: 6.0
Do you wish to do this again? (Y/N): y
Enter a number: 5
Enter a number 7
Their sum is: 12.0
Do you wish to do this again? (Y/N): n
 */
public class ch4ex5_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        char yOrN;
        //boolean doItAgain = true;

        do  {
            System.out.println("Enter 1st number: ");
            double num1 = input.nextDouble();
            System.out.println("Enter 2nd number: ");
            double num2 = input.nextDouble();
            double sum = num1 + num2;
            System.out.println("Their sum is: " + sum);
            System.out.println("Do you wish to do this again? (Y/N): ");
            yOrN = input.next().charAt(0);
        } while (yOrN == 'y' || yOrN == 'Y');

    }
}
