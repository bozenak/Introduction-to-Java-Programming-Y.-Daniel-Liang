import java.util.Scanner;

/*
Write a program that prompts the user to enter two numbers,
base and exponent, and calculates base^exponent.
 */
public class ch4ex34_XRaisedToThePowerOfY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers, base and exponent: ");
        int base = input.nextInt();
        int exponent = input.nextInt();
        double num = Math.pow(base,exponent);

        System.out.println(base + "^" + exponent + " = " + (int)num);
    }
}
