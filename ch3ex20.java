import java.util.Scanner;

//Science: wind-chill temperature
/*
Programming Exercise 2.17 gives a formula
to compute the wind-chill temperature.
The formula is valid for temperatures in
the range between −58ºF and 41ºF and wind speed greater than or equal to 2.

Write a program that prompts the user to enter a temperature and a wind speed.
The program displays the wind-chill temperature if the input is valid; otherwise,
it displays a message indicating whether the temperature and/or wind speed is
invalid.

2.17:
t(wc) = 35.74 + 0.6215(ta) - 35.75(v)^0.16 + 0.4275(ta)(v)^0.16

where t(a) is the outside temperature measured in degrees Fahrenheit
and (v) is the speed measured in miles per hour.
t(wc) is the wind-chill temperature.
The formula cannot be used for wind speeds below 2 mph
or temperatures below -58 ºF or above 41ºF.
example:
Enter the temperature in Fahrenheit between -58°F and 41°F:
5.3
Enter the wind speed (>=2) in miles per hour: 6
The wind chill index is -5.56707
 */
public class ch3ex20 {
public static void main(String[] args) {
    double temperature, windSpeed, windChillTemp;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a temperature between -58 ºF and 41ºF : ");
    temperature = input.nextDouble();
    System.out.println("Enter wind speed greater than or equal to 2: ");
    windSpeed = input.nextDouble();
    double minTemp = -58;
    double maxTemp = 41;

    if(temperature >= minTemp && temperature <= maxTemp && windSpeed >=2) {
        windChillTemp = 35.74 + (0.6215 * temperature) -
                (35.75 * Math.pow(windSpeed, 0.16)) +
                (0.4275 * temperature * Math.pow(windSpeed, 0.16));

        System.out.println("The wind chill index is: " + windChillTemp);
    }
    else {
        if (temperature >= minTemp && temperature <= maxTemp){
            System.out.println("Wind speed is invalid");
        }
        else if (windSpeed >=2) {
            System.out.println("Temperature entered is invalid");
        }
        else if ((windSpeed != 2 || windSpeed < 2) &&
                (temperature != minTemp || temperature < minTemp || temperature != maxTemp ||
                        temperature > maxTemp)) {
            System.out.print("Temperature entered invalid, wind speed invalid");
        }

    }
}
}
