import java.util.Scanner;

//Calculation of revenue
/*
The sales division of XYZ company is divided into different zones.
Write a program that prompts the user to enter total sales of the company XYZ,
and the sales percentage of the central zone in the previous year,
and calculates the total revenue earned by the central zone for the company XYZ.
example:
total sales of the company XYZ = 10000
sales percentage of the central zone = 0.4
Central zone sales = 4000
 */
public class ch2ex10 {
    public static void main(String[] args) {
        double totalSale, percentCentralZone, totalRevenue;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total sale of company XYZ: ");
        totalSale = input.nextDouble();
        System.out.println("Enter percentage of central zone sale: ");
        percentCentralZone = input.nextDouble() / 100;

        totalRevenue = totalSale * percentCentralZone;
        System.out.println("The total revenue earned by the central zone for the company XYZ is "
        + totalRevenue);

    }
}
