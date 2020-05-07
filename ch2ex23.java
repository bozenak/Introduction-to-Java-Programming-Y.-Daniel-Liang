import java.util.Scanner;

//find the upper case equivalent character of an ASCII code
/*
write a program that receives ASCII code for a lower case character
( an integer between 97 an 122)
and displays it's upper keys equivalent
Hint:
A (upper case) and a (lower case) have a difference of 32 in ASCII code
example:
ASCII code = 99
The lower case character is c and it's equivalent upper case character is A
 */
public class ch2ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 97 and 122: ");
        int character  = input.nextInt();
        char chLowerCase = (char) character;
        int characterUpperCase = character - 32;
        char chUpperCase = (char)characterUpperCase;
        System.out.println("The lower case character is " + chLowerCase +
                " and it's equivalent upper case character is " + chUpperCase);


    }
}
