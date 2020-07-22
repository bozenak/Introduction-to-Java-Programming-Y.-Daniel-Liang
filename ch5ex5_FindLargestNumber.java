import java.util.Scanner;

/*
Write a method with the following header to display the largest number of three numbers:
public static void displayLargestNumbers(
double num1, double num2, double num3)
Write a test program and displays the largest of three numbers.
 */
public class ch5ex5_FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displayLargestNumbers(num1, num2, num3);
    }
    public static void displayLargestNumbers(double num1, double num2, double num3){
        double largestNum = 0;
        if (largestNum < num1)
            largestNum = num1;
        if (largestNum < num2)
            largestNum = num2;
        if (largestNum < num3)
            largestNum = num3;
        System.out.print("The largest number is: " + largestNum);
       }

}
