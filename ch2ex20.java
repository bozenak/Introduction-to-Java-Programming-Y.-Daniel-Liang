import java.util.Scanner;

//Financial application: calculate interest
/*
If you know the balance and the annual
percentage interest rate, you can compute the interest on the next monthly payment
using the following formula:
interest = balance * (annualInterestRate/1200)
Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month.
example:
Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
The interest is 2.91667
 */
public class ch2ex20 {
    public static void main(String[] args) {
        double interest, balance, annualInterestRate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance: ");
        balance = input.nextDouble();
        System.out.println("Enter annual interest rate: ");
        annualInterestRate = input.nextDouble();

        interest = balance * (annualInterestRate / 1200);
        System.out.println("The interest for the next month is: " + interest);
    }
}
