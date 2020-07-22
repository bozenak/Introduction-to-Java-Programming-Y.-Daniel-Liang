import java.util.Scanner;

/*
Listing 3.6 gives a program to compute tax.
Write a method for computing tax using the following header:
public static double computeTax(int status, double taxableIncome)
Use this method to write a program that prints a tax table for taxable taxableIncome from
$50,000 to $70,000 with intervals of $100 for all the following statuses:
Taxable     Single      Married Joint       Married         Head of
taxableIncome                  or Qualifying       Separate        a House
                        widow(er)
50000       8688        6665                8688            7353
50050       8700        6673                8700            7365
...
59950       11175       8158                11175           9840
60000       11188       8165                11188           9852
 */
public class ch5ex15_FinancialApplication_PrintTaxTable {
    public static void main(String[] args) {

        int status;
        double taxableIncome = 0;

        System.out.println("Taxable            Single      Married Joint       Married         Head of");
        System.out.println("taxableIncome                  or Qualifying       Separate        a House");
        System.out.println("                               widow(er)");
        System.out.println("---------------------------------------------------------------------------");

        for(taxableIncome = 50000; taxableIncome <= 60000; taxableIncome +=50) {
            System.out.printf("%-19.0f", taxableIncome);
            System.out.printf("%-12.0f", ComputeTax(0, taxableIncome));
            System.out.printf("%-20.0f", ComputeTax(1, taxableIncome));
            System.out.printf("%-16.0f", ComputeTax(2, taxableIncome));
            System.out.printf("%-12.0f\n", ComputeTax(3, taxableIncome));
        }
    }
    public static double ComputeTax(int status, double taxableIncome){
        double tax = 0;
        if (status == 0) {
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = (8350 * 0.10) + ((taxableIncome - 8350) * 0.15);
            else if (taxableIncome <= 82250)
                tax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((taxableIncome - 33950) * 0.25);
            else if (taxableIncome <= 171550)
                tax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((82250 - 33950) * 0.25) +
                        ((taxableIncome - 82250) * 0.28);
            else if (taxableIncome <= 372950)
                tax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((82250 - 33950) * 0.25) +
                        ((171550 - 82250) * 0.28) +
                        ((taxableIncome - 171550) * 0.33);
            else if (taxableIncome > 372950)
                tax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((82250 - 33950) * 0.25) +
                        ((171550 - 82250) * 0.28) +
                        ((372950 - 171550) * 0.33) +
                        ((taxableIncome - 372950) * 0.35);
        }

        if (status == 1) {
            if (taxableIncome <= 16700)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 67900)
                tax = (16700 * 0.10) + ((taxableIncome - 16700) * 0.15);
            else if (taxableIncome <= 137050)
                tax = (16700 * 0.10) +
                        ((67900 - 16700) * 0.15) +
                        ((taxableIncome - 67900) * 0.25);
            else if (taxableIncome <= 208850)
                tax = (16700 * 0.10) +
                        ((67900 - 16700) * 0.15) +
                        ((137050 - 67900) * 0.25) +
                        ((taxableIncome - 137050) * 0.28);
            else if (taxableIncome <= 372950)
                tax = (16700 * 0.10) +
                        ((67900 - 16700) * 0.15) +
                        ((137050 - 67900) * 0.25) +
                        ((171550 - 82250) * 0.28) +
                        ((372950 - 171550) * 0.33) +
                        ((taxableIncome - 372950) * 0.35);
            else if (taxableIncome > 372950) {
                tax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((82250 - 33950) * 0.25) +
                        ((171550 - 82250) * 0.28) +
                        ((372950 - 171550) * 0.33) +
                        ((taxableIncome - 372950) * 0.35);
            }
        }
        if (status == 2) {
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = (8350 * 0.10) + ((taxableIncome - 8350) * 0.15);
            else if (taxableIncome <= 68525)
                tax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((taxableIncome - 33950) * 0.25);
            else if (taxableIncome <= 104425)
                tax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((68525 - 33950) * 0.25) +
                        ((taxableIncome - 68525) * 0.28);
            else if (taxableIncome <= 186475)
                tax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((68525 - 33950) * 0.25) +
                        ((104425 - 68525) * 0.28) +
                        ((taxableIncome - 104425) * 0.33);
            else if (taxableIncome > 186475)
                tax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((68525 - 33950) * 0.25) +
                        ((104425 - 68525) * 0.28) +
                        ((186475 - 104425) * 0.33) +
                        ((taxableIncome - 186475) * 0.35);
        }

         if (status == 3){
                if (taxableIncome <= 11950)
                    tax = taxableIncome *10;
                else if (taxableIncome <= 45500)
                    tax = (11950 * 0.10) +
                            ((taxableIncome - 11950) * 0.15);
                else if (taxableIncome <= 117450)
                    tax = (11950 * 0.10) +
                            ((45500 - 11950) * 0.15) +
                            ((taxableIncome - 45500) * 0.25);
                else if (taxableIncome <= 190200)
                    tax = (11950 * 0.10) +
                            ((45500 - 11950) * 0.15) +
                            ((117450 - 45500) * 0.25) +
                            ((taxableIncome - 117450) * 0.28);
                else if (taxableIncome <= 372950)
                    tax = (11950 * 0.10) +
                            ((45500 - 11950) * 0.15) +
                            ((117450 - 45500) * 0.25) +
                            ((190200 - 117450) * 0.28) +
                            ((taxableIncome - 190200) * 0.33);
                else if (taxableIncome > 372950)
                    tax = (11950 * 0.10) +
                            ((45500 - 11950) * 0.15) +
                            ((117450 - 45500) * 0.25) +
                            ((190200 - 117450) * 0.28) +
                            ((372950 - 190200) * 0.33) +
                            ((taxableIncome - 372950) * 0.35);
        }
        return tax;
    }
}
