//write a program that reads kilometers from the keyboard in double and display results in miles
// miles = kilometers / 1.609
// 10 km = 6.215040397762586

import java.util.Scanner;

public class ch2ex1 {
    public static void main(String[] args) {
        double km;
        double miles;
        System.out.println("Enter number of kilometers:");
        Scanner input = new Scanner(System.in);
        km = input.nextDouble();
        miles = km / 1.609;
        System.out.println( km + " " + "kilometers = " + " " + miles + " " + "miles" );


    }
}

