import java.util.Scanner;

/*
Write a method that computes the sum of the digits in an integer.
Use the following method header:
public static int productDigits(long n)

For example, sumDigits(234) returns 24 (2 * 3 * 4).
Use a loop to repeatedly extract and remove the digit until all the digits
are extracted.
Write a test program that prompts the user to enter an integer then
displays the product of all its digits.
(Hint: Use the % operator to extract digits and the / operator to remove the extracted digit.
For instance,
to extract 4 from 234, use 234 % 10 (= 4 ). To remove 4 from 234, use 234 / 10
(= 2 3 ).
 */
public class ch5ex2_ProductOfTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        long n = input.nextLong(); //integer entered by user
        productDigits(n);
    }
    public static int productDigits(long n){
        int product = 1;
        while(n != 0){
            int rem = (int) (n % 10);
            product = product * rem;
            n = n / 10;
        }
        System.out.print("Product of all digits is: ");
        System.out.print(product);
        return product;
    }
}
