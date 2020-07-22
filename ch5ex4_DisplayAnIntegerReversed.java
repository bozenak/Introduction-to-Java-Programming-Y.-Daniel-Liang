import java.util.Scanner;

/*
Write a method with the following header to display an integer in reverse order:
public static void reverse(int number)
For example, reverse(3456) displays 6543. Write a test program that prompts
the user to enter an integer then displays its reversal.
 */
public class ch5ex4_DisplayAnIntegerReversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();

        reverse(number);

    }

    public static void reverse(int number){
        int remainder;
        int reverseNum = 0;
        while(number > 0) {
            remainder = number % 10;
            reverseNum = reverseNum * 10 + remainder;
            number = number / 10;
        }
        System.out.print("The reverse number is " + reverseNum);
    }

}
