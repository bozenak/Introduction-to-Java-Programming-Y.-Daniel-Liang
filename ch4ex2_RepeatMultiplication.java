import java.util.Scanner;

/*
Write a program that prompts the user to enter number.
The number should be multiplied by 10 and the results stored in variable called product.
The program should iterate as long as the product contains a value of less then 100.
example:
Enter a number: 6
Enter a number: 12
 */
public class ch4ex2_RepeatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int product = 0;


        System.out.println("While loop");
        while(product < 100){
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            product = num * 10;
        }


        System.out.println("Do-While loop");
        do{
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            product = num * 10;
        } while(product < 100);


        System.out.println("For loop");
        product = 0;
        for( ; product < 100;  ){
        System.out.println("Enter a number: ");
        int num = input.nextInt();
            product = num * 10;
        }
    }
}
