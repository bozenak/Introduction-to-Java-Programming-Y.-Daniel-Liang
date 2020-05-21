import java.util.Scanner;

//Geometry: point in a rectangle?
/*
Write a program that prompts the user to enter
a point (x, y) and checks whether the point is within the rectangle centered at
(0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
(6, 4) is outside the rectangle.
(Hint: A point is in the rectangle
if its horizontal distance to (0, 0) is less than or equal to 10 / 2
and its vertical distance to (0, 0) is less than or equal to 5.0 / 2.
Test your program to cover all cases.) Here are two sample runs.
example:
Enter a point with two coordinates: 2 2
Point (2.0, 2.0) is in the rectangle

Enter a point with two coordinates: 6 4
Point (6.0, 4.0) is not in the rectangle
 */
public class ch3ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point x nad y: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double x0 = 0;
        double y0 = 0;
        double width = 10;
        double height = 5;



        boolean inRectangle = ((x <= width / 2) &&  (y <= height / 2));

        if (!inRectangle){
            System.out.println("Points (" + x + "," + y +") is not in the rectangle");
        }
        else {
            System.out.println("Points (" + x + "," + y +") is in the rectangle");
        }
    }
}
