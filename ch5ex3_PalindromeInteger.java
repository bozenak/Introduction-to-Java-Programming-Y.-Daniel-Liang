import java.util.Scanner;

/*
Write the methods with the following headers:
// Return the reversal of an integer, e.g., reverse(456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself.
Write a test program that prompts the user to enter an integer
and reports whether the integer is a palindrome.
 */
public class ch5ex3_PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int originalNumber = number;

        System.out.print("Number " + number + (isPalindrome(number) ? " is " : " is not ") + " palindrome.");

    }
    public static int reverse(int number){
        int remainder;
        int reverseNum =0;
        int originalNumber = number;
        while(originalNumber > 0) {
            remainder = originalNumber % 10;
            reverseNum = reverseNum * 10 + remainder;
            originalNumber = originalNumber / 10;
        }
            return reverseNum;
    }
    public static boolean isPalindrome(int number){
        return number == reverse(number) ? true : false;
        }


}
