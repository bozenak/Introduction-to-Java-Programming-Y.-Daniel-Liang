import java.util.Scanner;

//Financial application: monetary units
/*
Modify Listing 2.10, ComputeChange
.java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such
as 2 dollars and 3 pennies
 */
public class ch3ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        //number of dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //number of quarters in remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        //number of dimes in remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        //number of nickels
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        //number of pennies
        int numberOfPennies = remainingAmount;

        String dollar = "";
        String quarter = "";
        String dim = "";
        String nickel = "";
        String penny = "";

        if (numberOfDollars == 1){
            dollar = "Dollar";
        }
        else {
            dollar = "Dollars";
        }
        if (numberOfQuarters == 1){
            quarter = "Quarter";
        }
        else{
            quarter = "Quarters";
        }
        if (numberOfDimes == 1){
            dim = "Dim";
        }
        else{
            dim = "Dims";
        }
        if (numberOfNickels == 1){
            nickel = "Nickel";
        }
        else{
            nickel = "Nickels";
        }
        if (numberOfPennies == 1){
            penny = "Penny";
        }
        else{
            penny = "Pennies";
        }

        System.out.println("Your amount " + amount + " consist of \n" +
                "\t" + numberOfDollars + " " + dollar + "\n" +
                "\t" + numberOfQuarters + " " + quarter + "\n" +
                "\t" + numberOfDimes + " " + dim + "\n" +
                "\t" + numberOfNickels + " " + nickel + "\n" +
                "\t" + numberOfPennies + " " + penny);

    }
}
