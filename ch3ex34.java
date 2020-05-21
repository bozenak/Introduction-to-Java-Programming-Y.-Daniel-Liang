import java.util.Scanner;

//Geometry: point on line segment
/*
Programming Exercise 3.32 shows how to test
whether a point is on an unbounded line. Revise Programming Exercise 3.32 to
test whether a point is on a line segment.
Write a program that prompts the user
to enter the three points for p0, p1, and p2 and displays whether p2 is on the line
segment from p0 to p1.
example:
Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
(1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)

Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
(3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
 */
public class ch3ex34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        if ((x2 >= x0 && x2 <= x1 || x2 >= x1 && x2 <= x0) &&
                (y2 >= y0 && y2 <= y1 || y2 >= y1 && y2 <= y0)) {
            System.out.println("Point p2 is on the line segment");
        } else {
            System.out.println("Point p2 is not on the line segment");
        }
    }
}
