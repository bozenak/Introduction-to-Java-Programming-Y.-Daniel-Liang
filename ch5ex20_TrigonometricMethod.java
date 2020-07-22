/*
Print the following table to display the tan value of degree
from 0 to 360 with increments of 10 degree. Round the value to
keep 4 digits after the decimal place.

Degree      Tan
----------------
0           0.0000
10          0.1736
...
350         -0.1736
360         0.0000
 */
public class ch5ex20_TrigonometricMethod {
    public static void main(String[] args) {
        double degree = 0;
        System.out.println("Degree      Tan");
        System.out.println("------------------");
        for (degree=0; degree<=360; degree+=10){
            System.out.printf("%-12.0f", degree);
            double radians = Math.toRadians(degree); //convert degree to radians
            double tan = Math.tan(radians); // convert radians to tan
            System.out.printf("%.4f\n", tan);
        }
    }
}
