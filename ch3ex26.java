import java.util.Scanner;

//Use the &&, || and ^ operators
/*
Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6,
whether it is divisible by 5 or 6,
and whether it is divisible by 5 or 6, but not both.
example:
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? true
 */
public class ch3ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int userNum = input.nextInt();

        System.out.println("Is " + userNum +  " divisible by 5 and 6 ? " +
                (userNum % 5 == 0 && userNum % 6 == 0) );
        System.out.println("Is " + userNum + " divisible by 5 or 6 ? " +
                (userNum % 5 == 0 || userNum % 6 == 0));
        System.out.println("Is " + userNum +
                " divisible by 5 or 6, but not both of them ? " +
                ((userNum % 5 == 0 || userNum % 6 == 0) &&
                        (userNum % 5 != 0 || userNum % 6 != 0) ));





    }
}
