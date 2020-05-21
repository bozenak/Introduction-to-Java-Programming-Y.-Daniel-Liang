import java.util.Scanner;

//Geometry: points in triangle
/*
Suppose a right triangle is placed in a plane as
shown below. The right-angle point is placed at (0, 0), and the other two points
are placed at (200, 0), and (0, 100).
Write a program that prompts the user to enter
a point with x- and y-coordinates and determines whether the point is inside the
triangle.
example:
Enter a point's x- and y-coordinates: 100.5 25.5
The point is in the triangle

Enter a point's x- and y-coordinates: 100.5 50.5
The point is not in the triangle
 */
public class ch3ex27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with x- and y-coordinates");
        double x = input.nextDouble();
        double y = input.nextDouble();
        String point = "(" + x + "," + y + ")";


        //find intersect point on hypotenuse side
            double intersectX = (-x * (200 * 100)) / (-y * 200 - x * 100);
            double intersectY = (-y * (200 * 100)) / (-y * 200 - x * 100);

            if (x >= 0 && y >= 8 && x <= intersectX && y <= intersectY) {
                System.out.println("Point in triangle");
            }

        else {
            System.out.println("Point not in triangle");
        }
    }
}




