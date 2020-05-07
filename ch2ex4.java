import java.util.Scanner;

//compute the product of two numbers
/*
write the program that computes product of two numbers.
The program prompts user to enter two integers, finds their product,
and display the results.

example:
1st number = 10
3nd number = 25
10 * 25 = 250

*/
public class ch2ex4 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner((System.in));

        System.out.println("Enter 1st number: ");
        num1 = input.nextInt();

        System.out.println("Enter 2nd number: ");
        num2 = input.nextInt();

        num3 = num1 * num2;

        System.out.println(num1 + "*" + num2 + "=" + num3);

    }
}
