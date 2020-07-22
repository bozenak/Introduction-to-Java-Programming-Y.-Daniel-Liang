import java.util.Scanner;

/*
Write a program that prompts the user to enter a number.
The loop should iterate 5 times and keep a running total of numbers entered.
 */
public class ch4ex8_FindTheRunningSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int runs = 0;
        int sum = 0;

        /*do{
            System.out.println("Enter number: ");
            int num = input.nextInt();
            sum = sum + num;
            runs++;
        }while (runs <= 4);*/

        /*while(runs < 5){
            System.out.println("Enter number: ");
            int num = input.nextInt();
            sum = sum + num;
            runs++;
        }*/

        for(runs = 0; runs < 5; runs++){
            System.out.println("Enter number: ");
            int num = input.nextInt();
            sum = sum + num;
        }
        System.out.println("The sum of numbers is " + sum);
    }
}
