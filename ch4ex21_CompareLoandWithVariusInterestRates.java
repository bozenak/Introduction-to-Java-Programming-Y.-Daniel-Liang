import java.util.Scanner;

/*
Write a program that lets the user enter the loan amount and loan period in number of years
and displays the monthly and total payments for each interest rate starting from
5% to 8%, with an increment of 1/8. Here is a sample run:
Loan Amount: 10000
Number of Years: 5
Interest Rate       Monthly Payment     Total Payment
5.000%              188.71              11322.74
5.125%              189.29              11357.13
5.250%              189.86              11391.59
...
7.875%              202.17              12129.97
8.000%              202.76              12165.84
 */
public class ch4ex21_CompareLoandWithVariusInterestRates {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //take user input for loan amount and number of years
        System.out.println("Enter the loan amount and loan period in number of years: ");
        double loanAmount = userInput.nextDouble();
        double numOfYears = userInput.nextDouble();

        //declare annual interest rate
        double annualInterestRate = 0.05;

        System.out.print("Interest Rate    " + "Monthly Payment    " + "Total Payment    ");

        /*loop:
        for annual interest rate starting at 5%, and less than 8.125%
        (if you do less then 8% it will not display 8.000% figure)
        increase annual interest rate by 0.125%, calculate
        and display annualInterestRate, monthlyPayment and totalPayment
         */
        for(annualInterestRate = 0.05; annualInterestRate <= 0.08125; annualInterestRate = annualInterestRate + 0.00125){
           double monthlyInterestRate = annualInterestRate / 12;
           double monthlyPayment = loanAmount * monthlyInterestRate /
                   (1 - 1/Math.pow(1 + monthlyInterestRate, numOfYears * 12));

           double totalPayment = monthlyPayment * numOfYears * 12;

           System.out.println();
           System.out.printf("%.3f", annualInterestRate * 100  );
           System.out.print("%");
           System.out.printf("%17.2f", monthlyPayment);
           System.out.printf("%21.2f", totalPayment);

       }

    }
}
