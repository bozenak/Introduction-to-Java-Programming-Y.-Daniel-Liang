import javax.swing.*;

// Using GUI input
/*
Rewrite the exercise 2.6 using GUI input and output
 */
public class ch2ex26 {
    public static void main(String[] args) {

        //show dialog box
        String input = JOptionPane.showInputDialog("Enter integer between 100 and 999");

        //parse input as integer
        int userInput = Integer.parseInt(input);

        //declare 1st, 2nd and 3rd digits and reminder
        int firstDigit, secondDigit, thirdDigit, reminder;

        //extract 3rd digit
        thirdDigit = userInput % 10;
        //extract reminder
        reminder = userInput / 10;
        // extract 2nd digit
        secondDigit = reminder % 10;
        //extract reminder
        reminder = reminder / 10;
        //extract 1st digit
        firstDigit = reminder % 10;

        //display output in the box
        String output = "Result is " + thirdDigit + secondDigit + firstDigit;
        JOptionPane.showMessageDialog(null, output);

    }
}
