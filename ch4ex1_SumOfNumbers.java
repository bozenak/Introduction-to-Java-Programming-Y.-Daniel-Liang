import java.util.Scanner;

//Sum of numbers from 1 to a given number
/*
Write a program that ask user for a positive, non-zero integer value.
The program should use a loop to compute the sum of all integers from 1 to entered number.
If the user enters 20, the loop will find the sum of 1,2,3...20.
example:
Enter a positive non-zero integer: 20
The sum of all integers from 1 to 20 is 210.
 */
public class ch4ex1_SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive non-zero integer: ");
        int inputNum = input.nextInt();
        int sum = 0;
        int num;
        for(num=1; num <= inputNum; num++){
            //int sum = 0;
            sum = sum + num;
        }
        System.out.println("For loop \n" + "The sum of all integers from 1 to " + inputNum + " is " + sum);

        while (num <= inputNum){
            num = 0;
            sum = sum + num;
            num++;
        }
        System.out.println("While loop \n" + "The sum of all integers from 1 to " + inputNum + " is " + sum);


        num = 0; sum = 0;
        do {
            sum = sum + num;
            num++;
        } while (num <= inputNum);
        System.out.println("Do-While loop \n" + "The sum of all integers from 1 to " + inputNum + " is " + sum);
    }
}
