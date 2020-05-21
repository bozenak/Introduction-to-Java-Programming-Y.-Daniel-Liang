import com.sun.tools.javac.Main;

import java.util.Scanner;

//Compute the perimeter of a triangle
/*
Write a program that reads three edges for
a triangle and computes the perimeter if the input is valid. Otherwise,
display that the input is invalid.
The input is valid if the sum of every pair of two edges is
greater than the remaining edge.
example:
Enter three edges of triangle:
1.5 -3.4 4.6 5 9.5 -3.4
Perimeter is: 26.678480948253217
 */
public class ch3ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges of triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        if ((x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
            (x1 + y2 > x2 + y2 && x3 + y3 > x2 + y2 ) ||
                (x2 + y2 > x1 + y1 && x2 + y3 > x1 + y1 )) {

            double side1= Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
            double side2= Math.sqrt(Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2));
            double side3= Math.sqrt(Math.pow(x1 - x3,2) + Math.pow(y1 - y3,2));

            double perimeter = side1 + side2 + side3;
            System.out.println("Perimeter is: " + perimeter);
        }
        else{
            System.out.println("Invalid input !");
        }

    }
}
