import java.util.Scanner;

/*
Write a program that prints the first n term of the Fibonacci series.
Hint: The Fibonacci series is: 0 1 1 2 3 5 8 13 21 34
 */
public class ch4ex27_FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of terms - n: ");
        int n = input.nextInt();

        int x = 0, y = 1;
        int sum = 0;
        int i = 0;

        do{
            System.out.print(x + " ");
            System.out.print(y + " ");
            x = x + y;
            y = y + x;
            i++;
        }while(i < n);

    }
}
