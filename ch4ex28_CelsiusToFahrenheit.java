/*
Write a program that display a table of temperatures from 0 to 20 degree in Celsius,
and their Fahrenheit equivalent. The formula is:
F = (9/5)C + 32
where F is the temperature in Fahrenheit and C is the temperature in Celsius.
 */
public class ch4ex28_CelsiusToFahrenheit {
    public static void main(String[] args) {

        System.out.print("Celsius:        " + "Fahrenheit:    ");
        System.out.print("\n");

        for(double i = 0; i <= 20; i++){
            System.out.printf("%-16.2f", i);

            double f = i * 9/5 + 32;
            System.out.printf("%.2f", f);

            System.out.print("\n");
        }

    }
}
