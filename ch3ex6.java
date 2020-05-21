import java.util.Scanner;

//Health application: BMI
/*
Revise Listing 3.4, ComputeAndInterpretBMI.java, to
let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
inches, you will enter 5 for feet and 10 for inches.
example:
Enter weight in pounds: 140
Enter feet: 5
Enter inches: 10
BMI is 20.087702275404553
Normal
 */
public class ch3ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter feet: ");
        int feet = input.nextInt();
        System.out.println("Enter inches: ");
        int inches = input.nextInt();

        double height = feet * 12 + inches;

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilo = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;

        double bmi = weightInKilo / (heightInMeters * heightInMeters);

        System.out.println(bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi <25){
           System.out.println("Normal");
        }
        else if (bmi < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
