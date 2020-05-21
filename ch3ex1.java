import javax.swing.*;

//Algebra: solve quadratic equations
/*
The two roots of a quadratic equation ax2 + bx + c = 0
can be obtained using the following formula:
r1 =(-b + Square root of(b^2 - 4ac)) / 2a
and
r2 =(-b - Square root of(b^2 - 4ac)) / 2a

b^2 - 4ac is called the discriminant of the quadratic equation.
If it is positive, the equation has two real roots.
If it is zero, the equation has one root.
If it is negative, the equation has no real roots.

Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant.
If the discriminant is positive, display two roots.
If the discriminant is 0, display one root.
Otherwise, display “The equation has no real roots”.
Note that you can use Math.pow(x, 0.5) to compute Square root of x.
example1:
Enter a, b, c: 1.0 3 1
The equation has two roots -0.381966 and -2.61803
example2:
Enter a, b, c: 1 2.0 1
The equation has one root -1
example3:
Enter a, b, c: 1 2 3
The equation has no real roots
 */
public class ch3ex1 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter values for a");
        double a = Double.parseDouble(input1);
        String input2 = JOptionPane.showInputDialog("Enter values for b, and c with a spaces");
        double b = Double.parseDouble(input2);
        String input3 = JOptionPane.showInputDialog("Enter values for a, b, and c with a spaces");
        double c = Double.parseDouble(input3);

        double discriminant = Math.pow(b,2) - (4 * a * c);
        if (discriminant > 0 ){
            //r1 =(-b + Square root of(b^2 - 4ac)) / 2a
            //r2 =(-b - Square root of(b^2 - 4ac)) / 2a
            double r1 = ((-b + (Math.pow((Math.pow(b,2) - (4 * a *c)),0.5)) )) / 2 * a;
            double r2 = ((-b - (Math.pow((Math.pow(b,2) - (4 * a *c)),0.5)) )) / 2 * a;
            String output = "The discriminant is positive, two roots are: \n" +
                    "r1 = " + r1 + "\n r2 = " + r2 ; JOptionPane.showMessageDialog(null, output);
        }
        else if (discriminant == 0 ){
            double r = ((-b + (Math.pow((Math.pow(b,2) - (4 * a *c)),0.5)) )) / 2 * a;
            String output = "There is one root: \n" +
                    "r = " + r; JOptionPane.showMessageDialog(null, output);
        }
        else {
            String output = "The equation has no real roots" ; JOptionPane.showMessageDialog(null, output);
        }



    }

}