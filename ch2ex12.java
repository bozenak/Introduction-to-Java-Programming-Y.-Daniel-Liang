import java.util.Scanner;

//Physics: finding runway length
/*
Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:

length = v^2 / 2a

Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway
length.

example:
Enter speed and acceleration: 60 3.5
The minimum runway length for this airplane is 514.286
 */
public class ch2ex12 {
    public static void main(String[] args) {
        double metersPerSecond, acceleration, length;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter take-off speed in meters per second: ");
        metersPerSecond = input.nextDouble();
        System.out.println("Enter acceleration in meters/second squared: ");
        acceleration = input.nextDouble();

        length = Math.pow(metersPerSecond,2.0) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + length);


    }
}
