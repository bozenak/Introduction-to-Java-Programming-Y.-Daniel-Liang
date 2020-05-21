import java.util.Scanner;

//Geometry: two rectangles
/*
Write a program that prompts the user to enter the
center x-, y-coordinates, width, and height of two rectangles and determines
whether the second rectangle is inside the first or overlaps with the first, as shown
in Figure 3.9. Test your program to cover all cases.
example:
Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43
Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3
r2 is inside r1

Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5
Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5
r2 overlaps r1

Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3
Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2
r2 does not overlap r1
 */
public class ch3ex28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the center x-, y-coordinates, width, and height of 1st rectangle");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        System.out.println("Enter the center x-, y-coordinates, width, and height of 2nd rectangle");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        // Determine whether the second rectangle is inside the first
        if	((Math.pow(Math.pow(y2 - y1, 2), .05) + h2 / 2 <= h1 / 2) &&
                (Math.pow(Math.pow(x2 - x1, 2), .05) + w2/ 2 <= w1 / 2) &&
                (h1 / 2 + h2 / 2 <= h1) &&
                (w1 / 2 + w1 / 2 <= w1))
            System.out.println("rectangle2 is inside rectangle1");
        else if ((x1 + w1 / 2 > x2 - w2) ||
                (y1 + h1 / 2 > y2 - h2))
            System.out.println("rectangle2 overlaps rectangle1");
        else
            System.out.println("rectangle2 does not lies or overlaps rectangle1");



    }
}
