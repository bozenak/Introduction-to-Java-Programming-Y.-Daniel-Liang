import java.util.Scanner;
/*
A pen manufacturing company sells pens at a profit of 30%.
If you know a retail price of a pen you can calculate a profit
it generates using the formula:

Profit = retailPrice * 0.30

Write a program that ask user for retail price of pen,
calculates the profit on that pen,
and displays the results on the screen.
example:
retail price of pen = 4
profit = 1.2 $
 */
public class ch2ex16 {
    public static void main(String[] args) {
    double profit, retailPrice, margin ;

    margin = 0.30;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter retail price: ");
    retailPrice = input.nextDouble();
    profit = retailPrice * margin;
    System.out.println("Amount of profit is " + profit + " $");



    }
}
