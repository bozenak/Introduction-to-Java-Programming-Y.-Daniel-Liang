import java.util.Scanner;

/*
The area of a pentagon can be computed using the following formula:
Area = (5 * s^2) / (4 * tan(pi/5) )

Write a method that returns the area of a pentagon using the following header:
public static double area(double side)
Write a main method that prompts the user to enter the side of a pentagon and
displays its area. Here is a sample run:
Enter the side: 5.5
The area of the pentagon is 52.04444136781625
 */
public class ch5ex35_Geometry_AreaOfPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of a pentagon: ");
        double sideOdPentagon = input.nextDouble();
        double area = areaOfPentagon(sideOdPentagon);
        System.out.println("The area of the pentagon is: " + area);
    }
    public static double areaOfPentagon(double side){

        return (5 * Math.pow(side,2) / (4 * Math.tan(Math.PI / 5))) ;
    }
}
