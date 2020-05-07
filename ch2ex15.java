import java.util.Scanner;

//Geometry: area of a triangle
/*
Write a program that prompts the user to enter
three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
The formula for computing the area of a triangle is
s = (side1 + side2 + side3)/2;
area = s(s - side1)(s - side2)(s - side3)

example:
Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
The area of the triangle is 33.6
 */
public class ch2ex15 {
    public static void main(String[] args) {
        double x1, x2, x3, y1, y2, y3, s, area, s1, s2, s3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter points x1, y1");
        x1 = input.nextDouble();
        y1 = input.nextDouble();

        System.out.println("Enter points x2, y2");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        System.out.println("Enter points x3, y3");
        x3 = input.nextDouble();
        y3 = input.nextDouble();



        // s1 = ( (x2 - x1)^2 + (y2 - y1)^2) ) ^ 1/2
        // s2 = ((x3 - x2)^2 + (y3 - y2)^2) ^ 1/2
        // s3 = ((x1 - x3)^2 + (y1 - y3)^2) ^ 1/2
        //s = (side1 + side2 + side3)/2;
        //area = (s(s - side1) * (s - side2) * (s - side3)) ^ 1/2

        s1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        s2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        s3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        s = (s1 + s2 + s3 )/2;
        area = Math.sqrt(s * ((s - s1) * (s - s2) * (s - s3)));

        System.out.println(area);
    }
}
