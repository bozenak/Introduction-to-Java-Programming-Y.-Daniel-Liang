import java.util.Scanner;

//Financial application: compound value)
/*
Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest
rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month.

example:
Enter the monthly saving amount: 100
After the sixth month, the account value is $608.81
 */
public class ch2ex13 {
    public static void main(String[] args) {
        double monthlySavings, totalAmount, interestRate;
        interestRate = 0.05 / 12;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a monthly saving amount: ");
        monthlySavings = input.nextDouble();

        //1st month
        totalAmount = monthlySavings * ( 1 + interestRate);
        System.out.println("After 1st month the account value is: " + totalAmount + "$");

        //2nd month
        totalAmount = (totalAmount + 100) * (1 + interestRate);
        System.out.println("After 2nd month the account value is: " + totalAmount + "$");

        //3rd month
        totalAmount = (totalAmount + 100) * (1 + interestRate);
        System.out.println("After 3rd month the account value is: " + totalAmount + "$");

        //4th month
        totalAmount = (totalAmount + 100) * (1 + interestRate);
        System.out.println("After 4th month the account value is: " + totalAmount + "$");

        //5th month
        totalAmount = (totalAmount + 100) * (1 + interestRate);
        System.out.println("After 5th month the account value is: " + totalAmount + "$");

        //6th month
        totalAmount = (totalAmount + 100) * (1 + interestRate);
        System.out.println("After 6th month the account value is: " + totalAmount + "$");


    }
}
