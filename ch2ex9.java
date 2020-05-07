import java.util.Scanner;

//Financial application: calculate future investment value
/*
Write a program that
reads in investment amount, annual interest rate, and number of years, and displays
the future investment value using the following formula:
futureInvestmentValue =
investmentAmount * (1 + monthlyInterestRate) to the power of numberOfYears*12

For example, if you enter amount 1000, annual interest rate 3.25%, and number
of years 1, the future investment value is 1032.98.
Here is a sample run:
Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Accumulated value is $1043.92

 */
public class ch2ex9 {
    public static void main(String[] args) {
        double investmentAmount, monthlyInterestRate, futureInvestmentValue;
        int  numberOfYears;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        investmentAmount = input.nextDouble();
        System.out.println("Enter monthly interest rate in %: ");
        monthlyInterestRate = (input.nextDouble())/100;
        System.out.println("Enter number of years: ");
        numberOfYears = input.nextInt() * 12 ;

        futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyInterestRate / 1200), (numberOfYears * 12)));



        System.out.println("Future investment value = " + futureInvestmentValue);

    }
}
