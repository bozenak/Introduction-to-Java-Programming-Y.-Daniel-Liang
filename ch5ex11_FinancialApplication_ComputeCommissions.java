/*
Write a method that computes the commission,
using the scheme in Programming Exercise 4.39.
The header of the method is as follows:
public static double computeCommission(double salesAmount)
Write a test program that displays the following table:

Sales       Amount Commission
-------------------------------
10000       900.0
15000       1500.0
...
95000       11100.0
100000      11700.0
 */
public class ch5ex11_FinancialApplication_ComputeCommissions {
    public static void main(String[] args) {
        double sales = 0;
        double commission = 0;

        System.out.println("Sales       Amount Commission");
        System.out.println("------------------------------");
        for(sales=10000; sales <= 100000; sales += 5000){
            System.out.printf("%-12.0f", sales);
            System.out.printf("%.1f\n", computeCommission(sales));
        }


    }
    public static double computeCommission(double salesAmount){
        double commission;
        //calculate commission
        if (salesAmount > 0 && salesAmount <= 5000 ){
            commission = salesAmount * 0.08;
        }
        else if (salesAmount > 5000 && salesAmount <= 10000){
            commission = (5000 * 0.08) + (salesAmount - 5000) * 0.10;
        }
        else{
            commission = (5000 * 0.08) + (5000 * 0.10) + ((salesAmount - 10000) * 0.12);
        }
        //calculate total salary
        return commission;
    }
}

