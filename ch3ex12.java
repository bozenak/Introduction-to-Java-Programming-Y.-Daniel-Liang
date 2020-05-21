import java.util.Scanner;

//check a number
/*
write a program that prompts the user to enter integer number
and check whether the number is divisible by both 3 and 7,
or by neither of them.
example:
9 is divisible by 3 or 7, but not by both
21 is divisible by both, 3 and 7
25 is not divisible by either 3 or 7
 */
public class ch3ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int userNum = input.nextInt();

        int num1 = 3, num2 = 7;

        if (userNum % 3 == 0 && userNum % 7 == 0) {
            System.out.println("Number " + userNum + " is divisible by both, " +
                    num1  + " and " + num2);
        }
        else if ((userNum % 3 == 0 && userNum % 7 != 0) ||
                (userNum % 3 != 0 && userNum % 7 == 0)  ) {
            System.out.println("Number " + userNum + " is divisible by "
                    + num1 +" or " + num2 + ", but not by both");
        }
        else{
            System.out.println("Number " + userNum + " is not divisible by either "
            + num1 + " or " + num2);
        }


    }

}
