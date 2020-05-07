import java.util.Scanner;

//Geometry: distance of two points
/*
Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.
you can use Math.pow(a, 0.5) to compute squared root
example:
Enter x1 and y1: 1.5 -3.4
Enter x2 and y2: 4 5
The distance between the two points is 8.764131445842194
 */
public class ch2ex19 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, distance;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Enter x2 and y2: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);

        System.out.println("The distance between two point is: " + distance);
    }
}
