import java.util.Scanner;

//Financial: compare costs
/*
Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of the each package and displays the one with
the better price.
example:
Enter weight and price for package 1: 50 24.59
Enter weight and price for package 2: 25 11.99
Package 2 has a better price.

Enter weight and price for package 1: 50 25
Enter weight and price for package 2: 25 12.5
Two packages have the same price.
 */
public class ch3ex33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight and price for package1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.println("Enter weight and price for package2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        if(price1 * 100 / weight1 > price2 * 100 / weight2){
            System.out.println("Package 2 has a better price.");
        }
        else if (price1 * 100 / weight1 == price2 * 100 / weight2){
            System.out.println("Two packages have the same price.");
        }
        else{
            System.out.println("Package 1 has a better price.");
        }

    }
}
