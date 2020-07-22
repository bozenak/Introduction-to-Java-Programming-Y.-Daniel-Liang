/*
Write a class that contains the following two methods:

//convert from feet to meters
public static double footToMeter(double foot)

//convert from meters to feet
public static double meterToFoot(double meter)

the formula for the conversion is:
meter = 0.305 * foot
foot = 3.279 * meter

Write a test program that invokes these methods
to display the following table:
Feet        Meters          |       Meters          Feet
------------------------------------------------------------
1.0         0.305           |       20.0            65.574
2.0         0.610           |       25.0            81.967
...
9.0         2.745           |       60.0            196.721
10.0        3.050           |       65.0            213.115
 */
public class ch5ex9_ConversionBetweenFeetToMeters {
    public static void main(String[] args) {
        double feet = 1.0;
        double meters = 20.0;
        System.out.println("Feet        Meters          |       Meters          Feet");
        System.out.println("--------------------------------------------------------------");
        for(feet = 1.0; feet <= 10.0; feet++){
            System.out.printf("%-12.1f", feet);
            System.out.printf("%-16.3f", footToMeter(feet));
            System.out.printf("%-8c", '|');
            System.out.printf("%-16.1f", meters);
            System.out.printf("%-11.3f\n", meterToFoot(meters));
            meters = meters + 5.0;
        }
    }
    public static double footToMeter(double foot){
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
