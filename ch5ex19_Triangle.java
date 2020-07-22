import java.util.Scanner;

/*
Create a class named MyTriangle that contain the following 2 methods:
//Return true if the sum of every two sides is greater than the third side.
public static boolean isValid(double side1, double side2, double side3)
//Return the area of the triangle
public static double area(double side1, double side2, double side3)

Write a test program that reads three sides for a triangle and computes tha area
 if the input is valid. Otherwise it displays that the input is invalid.
 The formula for computing the area of a triangle is given in exercise 2.15
 s = (side1 + side2 + side3)/2;
area = s(s - side1)(s - side2)(s - side3)
 */
public class ch5ex19_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (isValid(side1,side2,side3) == true){
            System.out.println("Area of triangle is " + area(side1,side2,side3));
        }
        else
            System.out.println("Invalid input");
    }
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side3 + side1 > side2) ? true: false;
    }
    public static double area(double side1, double side2, double side3){
       double s = (side1 + side2 + side3)/2;
       double area = Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
       return area;
    }
}
