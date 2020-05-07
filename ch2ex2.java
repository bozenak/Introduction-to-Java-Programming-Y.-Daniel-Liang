import java.util.Scanner;

/*
Compute the area and perimeter of rectangle
Write a program that reads in the length
and breadth of rectangle and computes the area and perimeter:
area = length * breadth
perimeter = 2 * (length + breadth)

example:
length = 2
breadth = 3
area = 6
perimeter = 10
*/
public class ch2ex2 {
    public static void main(String[] args) {
        double length, breadth;
        double area, perimeter;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of triangle: ");
        length = input.nextDouble();
        System.out.println("Enter breadth of triangle: ");
        breadth = input.nextDouble();

        area = length * breadth;
        perimeter = 2 * (length + breadth);

        System.out.println("Area of triangle =  " + area);
        System.out.println("Perimeter of triangle =  " + perimeter );


    }
}
