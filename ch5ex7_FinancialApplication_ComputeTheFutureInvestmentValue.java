import java.util.Scanner;

/*
Write a method that computes future investment value at a given interest rate
for a specified number of years. The future investment is determined using
the formula in Programming Exercise 2.21.
futureInvestmentValue =
investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12

Use the following method header:
public static double futureInvestmentValue(
double investmentAmount, double monthlyInterestRate,int years)

For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
Write a test program that prompts the user to enter the investment amount (e.g.,
1,000) and the interest rate (e.g., 9%) and prints a table that displays future value
for the years from 1 to 30, as shown below:

The amount invested: 1000
Annual interest rate: 9
Years   Future Value
1       1093.80
2       1196.41
...
29      13467.25
30      14730.57
 */
public class ch5ex7_FinancialApplication_ComputeTheFutureInvestmentValue {
    public static void main(String[] args) {
        double investmentAmount, monthlyInterestRate, annualInterestRate;
        int numOfYears;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the investment amount (e.g.,\n" +
                "1,000) and annual interest rate in percentage: ");

        investmentAmount = input.nextDouble();
        annualInterestRate = input.nextDouble();
        monthlyInterestRate = annualInterestRate / 1200;
        numOfYears = 30;

        System.out.println("The amount invested: " + investmentAmount);
        System.out.println("Annual interest rate: " + (int)annualInterestRate);
        System.out.println("Years   Future Value");
        for( int years=1; years<=numOfYears;years++) {
            System.out.printf("%-8d", years);
            System.out.printf("%11.2f\n", futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years){
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years *12);
    }
}
