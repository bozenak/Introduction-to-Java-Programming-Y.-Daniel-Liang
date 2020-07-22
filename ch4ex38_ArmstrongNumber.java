import java.util.Scanner;

/*
Write a program that prompts the user to enter the number between 100 and 999,
and check if the number is Armstrong number,
if the sum of the cubes of each digit of a number is equal to the number itself,
then that number is a Armstrong number.
For example:
153 = 1^3 + 5^3 + 3^3
 */
public class ch4ex38_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 100 and 999: ");
        int num = input.nextInt();
        int originalNum = num;
        int remainder;
        double armNum = 0;

        while (originalNum >= 100 && originalNum <= 999  && num >0){
            remainder = num % 10; // 0 or 1
            armNum = armNum +  Math.pow(remainder,3);
            num = num / 10;
        }

        if(armNum == originalNum) {
            System.out.println("Number " + originalNum + " is an Armstrong number");
        }
        else{
            System.out.println("Number " + originalNum + " is not an Armstrong number");
        }
    }
}
