import java.util.Scanner;

/*
Rewrite exercise 4.36 using a do-while loop.
 */
public class ch4ex40_SumOfADigitsOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int remainder, sum = 0;


        do {
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        } while(number > 0);
        System.out.println("The sum of number digits is: " + sum);
    }
}
