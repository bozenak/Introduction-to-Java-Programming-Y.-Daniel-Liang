import java.util.Scanner;

//Geometry: two circles
/*
Write a program that prompts the user to enter the center
coordinates and radii of two circles and determines whether the second circle is
inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2 is
inside circle1 if the distance between the two centers 6 = |r1 - r2| and circle2
overlaps circle1 if the distance between the two centers <= r1 + r2. Test your
program to cover all cases.)
example:
Enter circle1's center x-, y-coordinates, and radius: 0.5 5.1 13
Enter circle2's center x-, y-coordinates, and radius: 1 1.7 4.5
circle2 is inside circle1

Enter circle1's center x-, y-coordinates, and radius: 3.4 5.7 5.5
Enter circle2's center x-, y-coordinates, and radius: 6.7 3.5 3
circle2 overlaps circle1

Enter circle1's center x-, y-coordinates, and radius: 3.4 5.5 1
Enter circle2's center x-, y-coordinates, and radius: 5.5 7.2 1
circle2 does not overlap circle1
 */
public class ch3ex29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        //center point of circle 2 lies in circle 1
        double dist = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1 - y2, 2));
        if (dist <= r1 - r2 && r2 <=r1){
            System.out.println("Circle2 lies in circle1");
        }
        else if (dist <= r1 + r2){
            System.out.println("Circle2 overlaps circle1");
        }
        else{
            System.out.println("circle2 does not overlap circle1");
        }

    }
}
