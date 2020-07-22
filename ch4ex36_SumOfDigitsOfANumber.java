import java.util.Scanner;

/*
Write a program that prompt the user to enter number,
and then display sum of digits of that number using pretest loop.
For example if the number 123, the sum is
1 + 2 + 3 = 6
 */
public class ch4ex36_SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int remainder, sum = 0;


        while(number > 0) {
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        System.out.println("The sum of number digits is: " + sum);
    }
}
