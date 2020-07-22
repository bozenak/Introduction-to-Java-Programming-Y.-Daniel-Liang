import javax.sound.midi.SysexMessage;
import java.util.Scanner;

/*
The monthly payment for a given loan pays the principal and the interest.
The monthly interest is computed by multiplying the monthly interest rate and the balance
 (the remaining principal).
The principal paid for the month is therefore the monthly payment minus the monthly interest.
Write a program that lets the user enter the loan amount, number of years, and interest rate
and displays the amortization schedule for the loan.
Here is a sample run:
Loan Amount: 10000
Number of Years: 1
Annual Interest Rate: 7

Monthly Payment:   865.26
Total Payment:     10383.21

Payment    Interest    Principal   Balance
1           58.33       806.93      9193.07
2           53.62       811.64      8381.43
...
11          10.0        855.26      860.27
12          5.01        860.25      0.01
 */
public class ch4ex22_LoanAmortizationSchedule {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //take user input for loan amount, number of years and interest rate/100
        System.out.println("Enter the loan amount, loan period in number of years and interest rate: ");
        double loanAmount = userInput.nextDouble();
        double numOfYears = userInput.nextDouble();
        double annualInterestRate = userInput.nextDouble() / 100;

        //calculate monthly payment and total payment
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1/Math.pow(1 + monthlyInterestRate, numOfYears * 12));

        double totalPayment = monthlyPayment * numOfYears * 12;

        //display monthly and total payment
        System.out.println();
        System.out.print("Monthly Payment: ");
        System.out.printf("%10.2f", monthlyPayment);
        System.out.println();
        System.out.print("Total Payment:");
        System.out.printf("%15.2f", totalPayment);


        int payment;
        double interest, principal, balance;

        System.out.println("\n");
        System.out.print("Payment" + "    " + "Interest" + "    " +
                "Principal" + "    " + "Balance");
        System.out.print("\n");

        balance = loanAmount;


        /*
        Display loop:
        for payment starting at 1, and until payment isless then number of months,
        increment payment by 1, calculate and display payment,
        interest, principal and balance
         */
        for(payment = 1; payment <= numOfYears * 12; payment++) {
            System.out.printf("%-11d", payment);
            interest = monthlyInterestRate * balance;
            System.out.printf("%-12.2f", interest);
            principal = monthlyPayment - interest;
            System.out.printf("%-13.2f", principal);
            balance = balance - principal;
            System.out.printf("%-10.2f", balance);
            System.out.println();

        }



    }
}
