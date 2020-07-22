import java.util.Scanner;

/*
A regular polygon is an n-sided polygon in which all sides are of the same length
and all angles have the same degree (i.e., the polygon is both equilateral and equiangular).
The formula for computing the area of a regular polygon is
Area = (n * s^2) / (4 * tan(pi/n) )

Write a method that returns the area of a regular polygon using the following header:
public static double area(int n, double side)
Write a main method that prompts the user to enter the number of sides and the
side of a regular polygon and displays its area.

Here is a sample run:
Enter the number of sides: 5
Enter the side: 6.5
The area of the polygon is 72.69017017488385
 */
public class ch5ex36_Geometry_AreaOfRegularPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int numOfSides = input.nextInt();
        System.out.println("Enter the side: ");
        double sideOfPolygon = input.nextDouble();
        double area = area(numOfSides, sideOfPolygon);
        System.out.println("The area of the pentagon is: " + area);
    }
    public static double area(int n, double side){
        return (n * Math.pow(side,2) / (4 * Math.tan(Math.PI / n))) ;
    }


}
