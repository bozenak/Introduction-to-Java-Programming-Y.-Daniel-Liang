import java.util.Scanner;

//Financial application: compute taxes
/*
Listing 3.6, ComputeTax.java, gives the
source code to compute taxes for single filers. Complete Listing 3.6 to compute
the taxes for all filing statuses.
 */
public class ch3ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the filing status: \n" +
                "0 for single filer \n" +
                "1 for married jointly or qualifying widow(er) filer \n" +
                "2 for married separately \n" +
                "3 for head of household");
        int status = input.nextInt();

        System.out.println("Enter income amount: ");
        double income = input.nextDouble();
        double payableTax;
        switch(status) {
            case 0:
                if (income <= 8350) {
                    payableTax = income * 0.10;
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income <= 33950) {
                    payableTax = (8350 * 0.10) + ((income - 8350) * 0.15);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income <= 82250) {
                    payableTax = (8350 * 0.10) +
                            ((33950 - 8350) * 0.15) +
                            ((income - 33950) * 0.25);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income <= 171550) {
                    payableTax = (8350 * 0.10) +
                            ((33950 - 8350) * 0.15) +
                            ((82250 - 33950) * 0.25) +
                            ((income - 82250) * 0.28);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income <= 372950) {
                    payableTax = (8350 * 0.10) +
                            ((33950 - 8350) * 0.15) +
                            ((82250 - 33950) * 0.25) +
                            ((171550 - 82250) * 0.28) +
                            ((income - 171550) * 0.33);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income > 372950) {
                    payableTax = (8350 * 0.10) +
                            ((33950 - 8350) * 0.15) +
                            ((82250 - 33950) * 0.25) +
                            ((171550 - 82250) * 0.28) +
                            ((372950 - 171550) * 0.33) +
                            ((income - 372950) * 0.35);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else {
                    System.out.println("Incorrect input");
                }
            case 1:
                if (income <= 16700){
                    payableTax = income * 0.10;
                    System.out.println("Payable tax is " + payableTax + " dollars");
                }
                else if (income <= 67900) {
                    payableTax = (16700 * 0.10) + ((income - 16700) * 0.15);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income <= 137050) {
                    payableTax = (16700 * 0.10) +
                            ((67900 - 16700) * 0.15) +
                            ((income - 67900) * 0.25);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income <= 208850) {
                    payableTax = (16700 * 0.10) +
                            ((67900 - 16700) * 0.15)  +
                            ((137050 - 67900) * 0.25) +
                            ((income - 137050) * 0.28);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income <= 372950) {
                    payableTax = (16700 * 0.10) +
                            ((67900 - 16700) * 0.15) +
                            ((137050 - 67900) * 0.25) +
                            ((171550 - 82250) * 0.28) +
                            ((372950 - 171550) * 0.33) +
                            ((income - 372950) * 0.35);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income > 372950) {
                    payableTax = (8350 * 0.10) +
                            ((33950 - 8350) * 0.15) +
                            ((82250 - 33950) * 0.25) +
                            ((171550 - 82250) * 0.28) +
                            ((372950 - 171550) * 0.33) +
                            ((income - 372950) * 0.35);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else {
                    System.out.println("Incorrect input");
                }
            case 2:
                if (income <= 8350) {
                    payableTax = income * 0.10;
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income <= 33950) {
                    payableTax = (8350 * 0.10) + ((income - 8350) * 0.15);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income <= 68525){
                    payableTax = (8350 * 0.10) +
                            ((33950 - 8350) * 0.15) +
                            ((income - 33950) * 0.25);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income <= 104425){
                    payableTax = (8350 * 0.10) +
                            ((33950 - 8350) * 0.15) +
                            ((68525 - 33950) * 0.25) +
                            ((income - 68525) * 0.28);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income <= 186475){
                    payableTax = (8350 * 0.10) +
                            ((33950 - 8350) * 0.15) +
                            ((68525 - 33950) * 0.25) +
                            ((104425 - 68525) * 0.28) +
                            ((income - 104425) * 0.33);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                } else if (income > 186475){
                    payableTax = (8350 * 0.10) +
                            ((33950 - 8350) * 0.15) +
                            ((68525 - 33950) * 0.25) +
                            ((104425 - 68525) * 0.28) +
                            ((186475 - 104425) * 0.33) +
                            ((income - 186475) * 0.35);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                }
                else {
                    System.out.println("Incorrect input");
                }
            case 3:
                if (income <= 11950){
                    payableTax = income *10;
                    System.out.println("Payable tax is " + payableTax + " dollars");
                }
                else if (income <= 45500){
                    payableTax = (11950 * 0.10) +
                            ((income - 11950) * 0.15);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                }
                else if (income <= 117450) {
                    payableTax = (11950 * 0.10) +
                            ((45500 - 11950) * 0.15) +
                            ((income - 45500) * 0.25);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                }
                else if (income <= 190200){
                    payableTax = (11950 * 0.10) +
                            ((45500 - 11950) * 0.15) +
                            ((117450 - 45500) * 0.25) +
                            ((income - 117450) * 0.28);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                }
                else if (income <= 372950){
                    payableTax = (11950 * 0.10) +
                            ((45500 - 11950) * 0.15) +
                            ((117450 - 45500) * 0.25) +
                            ((190200 - 117450) * 0.28) +
                            ((income - 190200) * 0.33);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                }
                else if (income > 372950){
                    payableTax = (11950 * 0.10) +
                            ((45500 - 11950) * 0.15) +
                            ((117450 - 45500) * 0.25) +
                            ((190200 - 117450) * 0.28) +
                            ((372950 - 190200) * 0.33) +
                            ((income - 372950) * 0.35);
                    System.out.println("Payable tax is " + payableTax + " dollars");
                }
                else{
                    System.out.println("Incorrect input");
                }
        }

        }

    }


