import java.util.Scanner;

/*
Write a method with the following header to format the integer with the specified width.
public static String format(int number, int width)
The method returns a string for the number with one or more prefix 0s.
The size of the string is the width.
For example, format(34, 4) returns 0034
format(34, 5) returns 00034.
If the number is longer than the width, the method returns the
string representation for the number.
For example, format(34, 1) returns 34.
Write a test program that prompts the user to enter a number and its width, and
displays a string returned by invoking format(number, width).
 */
public class ch5ex37_FormatInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number and its width: ");
        int num = input.nextInt();
        int width = input.nextInt();
        String s = format(num, width);
        System.out.print(s);
    }
    public static String format(int number, int width){
        String d = number + ""; //convert number to string
         int lengthOfNumber  = d.length(); //count length
        String s = ""; //initialise empty string s
        char zero = '0'; // initialise 0 to be added to the string later in the loop
        for(int i=0; i < width - lengthOfNumber; i++){
            s += zero; //for each iteration add 0 to string
        }
            s = s + number; //add original number to the string
        return s;
    }
}
