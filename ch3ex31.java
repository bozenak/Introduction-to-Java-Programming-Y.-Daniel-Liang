import java.util.Scanner;

//Financials: currency exchange
/*
Write a program that prompts the user to enter
the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
example:
Enter the exchange rate from dollars to RMB: 6.81
Enter 0 to convert dollars to RMB and 1 vice versa: 0
Enter the dollar amount: 100
$100.0 is 681.0 yuan

Enter the exchange rate from dollars to RMB: 6.81
Enter 0 to convert dollars to RMB and 1 vice versa: 5
Enter the RMB amount: 10000
10000.0 yuan is $1468.43
 */
public class ch3ex31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the exchange rate from currency in U.S. dollars to Chinese RMB.");
        double exchangeRate = input.nextDouble();

        System.out.println("Enter 0 to convert from U.S. dollars to Chinese RMB\n " +
                "Enter 1 to convert from Chinese RMB and U.S. dollars");
        int conversion = input.nextInt();

        System.out.println("Enter the amount in U.S. dollars\n" +
                "or Chinese RMB to convert it to Chinese RMB or U.S.");
        double amount = input.nextDouble();
        double amountInDollars;
        double amountInRMB;

        switch(conversion){
            case 0 : amountInRMB = amount * exchangeRate;
            System.out.println(amount + "$ is " + amountInRMB + " yuan");
            break;
            case 1: amountInDollars = amount / exchangeRate;
            System.out.println(amount + " yuan is " + amountInDollars + "$");
            break;
        }





    }
}
