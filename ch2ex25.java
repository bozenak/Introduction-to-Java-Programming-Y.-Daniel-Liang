import java.util.Scanner;

//Financial application: payroll
/*
Write a program that reads following information
and prints payroll statement:
Employee's name (Smith)
Number of hours worked in a week (10)
Hourly pay rate (6.75)
Federal tax withholding rate (20%)
State tax withholding rate (9%)

example:
Employee name: Smith
Number of hours worked in a week: 10
Hourly pay rate: 6.75$
Gross Pay: 67.5 $
Deductions:
    Federal tax withholding rate 20%: 13.5$
    State tax withholding rate 9%: 6.07$
    Total deduction: 19.57$
Net Pay: 47.92$
 */
public class ch2ex25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String employeeName = input.next();
        System.out.println("Number of hours worked in a week: ");
        double numHours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double hourlyRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate in %: ");
        double federalTax = input.nextDouble() / 100;
        System.out.println("Enter state tax withholding rate in %: ");
        double stateTax = input.nextDouble() / 100;
        double grossPay = numHours * hourlyRate;
        double totalDeduction = (federalTax * grossPay) + (stateTax * grossPay);
        double netPay = grossPay - totalDeduction;

        System.out.println(" Employee name: " + employeeName);
        System.out.println("Hours worked: " + numHours);
        System.out.println("Pay rate: " + hourlyRate + "$");
        System.out.println("Gross Pay: " + grossPay + "$");
        System.out.println("Deductions: ");
        System.out.println("\t Federal tax withholding: " + (federalTax * grossPay));
        System.out.println("\t State tax withholding: " + (stateTax * grossPay));
        System.out.println("\t Total deduction: " + totalDeduction + "$" );
        System.out.println("Net pay: " + netPay + "$");


    }
}
