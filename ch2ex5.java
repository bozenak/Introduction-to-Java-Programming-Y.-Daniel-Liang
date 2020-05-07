import java.util.Scanner;

//Financial application: calculate tip
/*
Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.

example:
Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5
 */
public class ch2ex5 {
    public static void main(String[] args) {
        double subtotal, gratuityRate, total, gratuity;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of subtotal and gratuity: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();

        gratuity = gratuityRate / 10;

        total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " " + "and total is $" + total);
    }
}
