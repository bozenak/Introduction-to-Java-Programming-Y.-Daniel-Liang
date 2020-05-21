import java.util.Scanner;

// Game: learn multiplication
/*
write a program that generates two integers under 100
and prompt the user to enter the product of these two integers.
The program then reports true is the answer is correct, false otherwise.
 */
public class ch3ex4 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);

        int product = num1 * num2;
        Scanner input = new Scanner(System.in);
        System.out.println(num1 + " * " + num2 + " = ? ");
        int answer = input.nextInt();
         if (product == answer){
             System.out.println(num1 + " * " + num2 + " = " + answer + " " +(product == answer));
         }
         else{
             System.out.println(num1 + " * " + num2 + " = " + answer + " " + (product == answer));
         }
    }
}
