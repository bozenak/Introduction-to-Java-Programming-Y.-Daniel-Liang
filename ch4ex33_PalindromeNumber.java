import java.util.Scanner;

/*
Write a program that prompts the user to enter the number
and check whether the number is palindrome or not.
For example: 12321 is a palindrome, where the first digit matches
with the last digit, the second digit matches with the second last digit,
and so on...
 */
public class ch4ex33_PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int remainder;
        int reverseNum = 0;

        while(number > 0) {
            remainder = number % 10;
            reverseNum = reverseNum * 10 + remainder;
            number = number / 10;
           // System.out.println(remainder);
           // System.out.println(reverseNum);
           // System.out.println(originalNumber);


        }
        if (reverseNum == originalNumber){
            System.out.println("Number " + originalNumber + " is a palindrome.");
        }
        else{
            System.out.println("Number " + originalNumber + " is not a palindrome.");
        }





    }
}
