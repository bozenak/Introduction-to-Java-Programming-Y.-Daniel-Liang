import java.util.Scanner;

/*
Write a program that prompts the user to enter three points of triangle
and displays the angles in degree. Round the value to keep two digits
after the decimal point. The formula to compute the angels A, B and C is:
A = arccos ((a * a - b * b - c * c) / (-2 * b * c))
B = arccos ((b * b - a * a - c * c) / (-2 * a * c))
C = arccos ((c * c - b * b - c * c) / (-2 * a * b))

Enter three points: 1 1 6.5 1 6.5 2.5
The three angles are 15.26 90.0 74.74
 */
public class ch5ex23_Geometry_DisplayAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points of triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double sideA = CalculateSide(x3, x2, y3, y2);
        double sideB = CalculateSide(x2, x1, y2, y1);
        double sideC = CalculateSide(x3, x1, y3, y1);

        double angleA = Math.toDegrees(CalculateAngleRadians(sideA, sideB, sideC));
        double angleC = Math.toDegrees(CalculateAngleRadians(sideB, sideA, sideC));
        double angleB = Math.toDegrees(CalculateAngleRadians(sideC, sideB, sideA));

        System.out.println();
        System.out.println("The three angles are: ");
        System.out.printf("%.2f\n%.2f\n%.2f\n",angleA, angleB, angleC);
    }
    public static double CalculateSide(double x1, double x2, double y1, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double CalculateAngleRadians(double a, double b, double c ){
        return Math.acos((a * a - b * b - c * c) / (-2 * b * c ));
    }
}
