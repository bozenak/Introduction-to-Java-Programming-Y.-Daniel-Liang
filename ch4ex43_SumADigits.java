import java.util.Scanner;

//Sum a digits of a number until the results is a single digit
/*
Repeat exercise 4.36 until the result is a single digit.
For example:
if the input is 768 the sum is 21, and the sum of digits of 21 is 3:
2 + 1, here is the sample run:
Enter a number: 999
The sum of digits is 9.
 */
public class ch4ex43_SumADigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int remainder, sum = 0, singleDigitSum= 0;


        while(number > 0) {
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        System.out.println("The sum of number digits is: " + sum);


            if (sum >= 10) {
                number = sum;
                while (number > 0) {
                    //number = sum;
                    remainder = number % 10;
                    singleDigitSum = singleDigitSum + remainder;
                    number = number / 10;
            }
        }

        System.out.println("The sum of sum of number digits is: " + singleDigitSum);
    }
}

