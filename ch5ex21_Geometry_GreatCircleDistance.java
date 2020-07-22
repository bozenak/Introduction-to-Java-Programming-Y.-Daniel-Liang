import java.util.Scanner;

/*
The great circle distance is the distance between two point of the surface of sphere.
Let(x1,y1) and (x2,y2) be the geographical latitude and longitude of two points.
The great circle distance between two points can be computed using the formula:
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Write a program that prompts the user to enter the latitude and longitude
of two points on the earth degrees, and display it's great circle distance.
The average earth radius is 6371.01 km.
Note that you need to convert the degrees into radians using Math.toRadians
method since the java trigonometry method use radians.
The latitude and longitude degrees in the formula are North and West.
Use negative to indicate South and East degrees. Here is the sample ran:
Enter point 1 (latitude and longitude) in degrees:
39.55 -116.25
Enter point 2 (latitude and longitude) in degrees:
41.5 87.37
The distance between the two points is 10691.79183231593 km.
 */
public class ch5ex21_Geometry_GreatCircleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double x1Degree = input.nextDouble();
        double y1Degree = input.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double x2Degree = input.nextDouble();
        double y2Degree = input.nextDouble();
        double x1Radians = Math.toRadians(x1Degree);
        double y1Radians = Math.toRadians(y1Degree);
        double x2Radians = Math.toRadians(x2Degree);
        double y2Radians = Math.toRadians(y2Degree);
        double radius = 6371.01;
        double distance;

        distance = radius * Math.acos(Math.sin(x1Radians) * Math.sin(x2Radians) +
                Math.cos(x1Radians) * Math.cos(x2Radians) * Math.cos(y1Radians - y2Radians));
        System.out.println("The distance between the two points is " + distance + " km");
    }
}
