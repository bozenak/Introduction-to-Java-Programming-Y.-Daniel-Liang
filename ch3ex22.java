import java.util.Scanner;

//Geometry: point in a circle?)
/*
Write a program that prompts the user to enter a
point (x, y) and checks whether the point is within the circle centered at (0, 0)
with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
circle.
(Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
example:
Enter a point with two coordinates: 4 5
Point (4.0, 5.0) is in the circle

Enter a point with two coordinates: 9 9
Point (9.0, 9.0) is not in the circle
 */
public class ch3ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point x nad y: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double x0 = 0;
        double y0 = 0;
        double radius = 10;

        double distance = Math.sqrt(Math.pow(x0 - x,2) + Math.pow(y0 - y, 2));

        boolean inCircle = (distance <= radius);

        if (!inCircle){
            System.out.println("Points (" + x + "," + y +") is not in the circle");
        }
        else {
            System.out.println("Points (" + x + "," + y +") is in the circle");
        }
    }
}
