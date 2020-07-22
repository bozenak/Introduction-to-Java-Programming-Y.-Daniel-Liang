/*
You have just started a sales job in a department store.
Your pay consists of a base salary and a commission.
The base salary is $5,000. The scheme shown below is used to determine
the commission rate:
Sales Amount            Commission Rate
$0.01–$5,000            8 percent
$5,000.01–$10,000       10 percent
$10,000.01 and above    12 percent

Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
$5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
Your goal is to earn $30,000 a year.
Write a program that finds the minimum sales you have to generate
in order to make $30,000.
 */
public class ch4ex39_FinancialApplication_FindTheSalesAmount {
    public static void main(String[] args) {
        double baseSalary = 5000;
        double commission;
        double sales = 0;
        double totalSalary = 0;


        for(sales=0; totalSalary<=30000;sales++){
            //calculate commission
            if (sales > 0 && sales <= 5000 ){
                commission = sales * 0.08;
            }
            else if (sales > 5000 && sales <= 10000){
                commission = (5000 * 0.08) + (sales - 5000) * 0.10;
            }
            else{
                commission = (5000 * 0.08) + (5000 * 0.10) + ((sales - 10000) * 0.12);
            }
            //calculate total salary
            totalSalary = baseSalary + commission;
        }
        System.out.println("To achieve goal of 30000, you will need to generate sales of " + sales);

        System.out.print(sales + "    ");
        System.out.print(totalSalary);
        System.out.println("");
    }
}
