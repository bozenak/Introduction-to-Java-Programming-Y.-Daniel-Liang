import javax.swing.*;
import java.util.Scanner;

//Use the input dialog box
/*
rewrite Listing 3.8 LeapYear.java, using the input dialog box
 */
public class ch3ex18 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter year");
        int year = Integer.parseInt(input);

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            String output = year + " is a leap year"; JOptionPane.showMessageDialog(null, output);
        }
        else{
            String output = year + " is not a leap year"; JOptionPane.showMessageDialog(null, output);
        }

    }
}
