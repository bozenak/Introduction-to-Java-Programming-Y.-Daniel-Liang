/*
Write a class that contain following methods:

//convert from Celsius to Fahrenheit
public static double celsiusToFahrenheit(double celsius)

//convert from Fahrenheit to Celsius
public static double fahrenheitToCelsius(double fahrenheit)

The formula for conversion is:
fahrenheit = (9.0 / 5) * celsius + 32
celsius = (5.0 / 9) * (fahrenheit - 32)

Write a test program that invokes these methods to display the following table:
Celsius     Fahrenheit      |       Fahrenheit      Celsius
------------------------------------------------------------
40.0        104.2           |       120.0           48.89
39.0        102.2           |       110.0           43.33
...
32.0        89.6            |       40.0            4.44
31.0        87.8            |       30.0            -1.11

 */
public class ch5ex8_ConversionBetweenCelsiusAndFahrenheit {
    public static void main(String[] args) {
        double celsius = 40.0;
        double fahrenheit = 120.0;

        System.out.println("Celsius     Fahrenheit      |       Fahrenheit      Celsius");
        System.out.println("-------------------------------------------------------------");
        for( celsius=40.0; celsius >= 31.0; celsius--){
            System.out.printf("%-12.1f", celsius);
            System.out.printf("%-16.1f", celsiusToFahrenheit(celsius));
            System.out.printf("%-8c", '|');
            System.out.printf("%-16.1f", fahrenheit);
            System.out.printf("%-9.1f\n", fahrenheitToCelsius(fahrenheit));
            fahrenheit = fahrenheit - 10;

        }
    }
    public static double celsiusToFahrenheit(double celsius){
        return  (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return  (5.0 / 9) * (fahrenheit - 32);
    }
}
