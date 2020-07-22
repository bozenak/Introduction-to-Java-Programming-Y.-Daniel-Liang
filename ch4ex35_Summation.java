import java.util.Scanner;

/*
Write a program to compute the following summation:
x + x^2/2! + X^4/4! + ... + x^n/n!
 */
public class ch4ex35_Summation {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter n and x: ");
        int n = input.nextInt();
        int x = input.nextInt();
        double result = 0;
        int exponent = x;
        double summation = 0;

        for( int i=1; i<=n; ){
          result = Math.pow(x,exponent)/exponent;
            exponent = exponent * 2;
            summation = summation + result;
            System.out.println(summation);
        }
        summation= x + summation;
       // double summation = x + a;




    }
}
