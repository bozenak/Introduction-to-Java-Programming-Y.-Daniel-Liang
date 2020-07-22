import java.util.Scanner;

/*
Suppose you save $100 each month into a savings account with the annual interest rate 5%.
So, the monthly interest rate is 0.05 / 12 = 0.00417.
After the first month, the value in the account becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507 and so on.
Write a program that prompts the user to enter an amount (e.g., 100), the annual
interest rate (e.g., 5), and the number of months (e.g., 6) and displays the amount
in the savings account after the given month.
 */
public class ch4ex30_FinancialApplication_CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount of savings (e.g., 100), the annual\n" +
                "interest rate (e.g., 5), and the number of months (e.g., 6):  ");
        double savingsAmount = input.nextDouble();
        double annualInterestRate = input.nextDouble() / 100;
        int numOfMonths = input.nextInt();
        double totalAmount=0, monthlyInterestRate, monthlySaving=0;


        monthlyInterestRate = annualInterestRate / 12;

        System.out.println("Month    Total Savings");
        for(int i=1; i<=numOfMonths; i++){
            System.out.println();
            System.out.printf("%-5d", i);
            monthlySaving = ((monthlySaving + savingsAmount) * ( 1 + monthlyInterestRate));
            System.out.printf("%14.3f", monthlySaving);
            totalAmount = monthlySaving;
        }
        System.out.print("\n");
        System.out.println("Total Savings: ");
        System.out.printf("%.3f", totalAmount);


    }
}
