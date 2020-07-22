import java.util.Scanner;

/*
Write a program that calculates how much a person earns over a period of time,
if her wage is 1 penny the 1st day, 2 pennies 2nd day and continues to double each day.
The program should display a table showing the wage for each day,
and then showing the total pay at the end of the period.
The output should be displayed in pounds, not in pennies.
The period of time for which the wage is to be calculated is entered by the user.
*/
public class ch4ex26_SalaryPerDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of working days: ");
        int numOfDays = input.nextInt();

        double wageDaily = 1, totalPay = 0;


        System.out.println("Day        " + "Daily Pay        ");
        for( int i = 1; i <= numOfDays; i++){
            System.out.printf("%-11d", i);
            System.out.printf("%-11.2f", wageDaily/100);
            totalPay = totalPay + wageDaily;
            wageDaily = wageDaily + wageDaily;
            System.out.print("\n");
        }
        System.out.println("Total Pay: ");
        System.out.printf("%.2f", totalPay/100);

    }
}
