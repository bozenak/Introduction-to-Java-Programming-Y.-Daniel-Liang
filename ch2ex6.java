import java.util.Scanner;

//Find the reverse of an integer
/*
Write a program that reads integer between 100 and 999 and finds the reverse of that integer,
if the integer is 123 it will read 321
Use % operator to extract digits, and use the / operator to remove the extracted digit.
example:
123 % 10 = 3
123 / 10 = 12
 */
public class ch2ex6 {
    public static void main(String[] args) {
        // display message for user to enter number
        System.out.print("Enter number between 100 and 999: ");

        //declare user input as variable
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        //declare 1st, 2nd and 3rd digits and reminder
        int firstDigit, secondDigit, thirdDigit, reminder;

        //extract 3rd digit
        thirdDigit = userInput % 10;
        //extract reminder
        reminder = userInput / 10;
        // extract 2nd digit
        secondDigit = reminder % 10;
        //extract reminder
        reminder = reminder / 10;
        //extract 1st digit
        firstDigit = reminder % 10;

        System.out.println("Result is " + thirdDigit + secondDigit + firstDigit);



    }
}
