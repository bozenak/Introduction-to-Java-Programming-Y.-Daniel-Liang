import java.util.Scanner;

/*
Write a program that displays the factorial of all numbers in a given range.
In each line display a number and its factorial.
 */
public class ch4ex20_FactorialOfAllNumbersInGivenRange {
    public static void main(String[] args) {
        Scanner range = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = range.nextInt();
        int  factorial = 1;

        System.out.print("number  " + "factorial");

        if(num == 0 || num == 1){
            factorial = 1;
            System.out.printf("%-8d%-8d", num, factorial);
        }

        for(int i = 1; i <= num; i++){
           factorial = i * factorial;


            System.out.printf("%-8d%-8d", i, factorial);
            System.out.print("\n");
        }
    }
}
