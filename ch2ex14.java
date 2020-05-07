import java.util.Scanner;

//Health application: computing BMI
/*
Body Mass Index (BMI) is a measure of health on weight.
It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters.
Write a program that prompts the user to enter a weight in pounds
and height in inches and displays the BMI.
Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
example:
Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
 */
public class ch2ex14 {
    public static void main(String[] args) {
        double weightInPounds, weightInKilograms, heightInInches, heightInMeters, bmi;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a weight in pounds: ");
        weightInPounds = input.nextDouble();
        weightInKilograms = weightInPounds * 0.45359237;

        System.out.println("Enter height in inches: ");
        heightInInches = input.nextDouble();
        heightInMeters = heightInInches * 0.0254;

        bmi = weightInKilograms / Math.pow(heightInMeters,2.0);

        System.out.println("Your BMI is " + (float)bmi);
    }
}
