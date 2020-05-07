import javax.swing.*;

//financial application: simple interest
/*
rewrite exercise 2.9 using GUI input and output
 */
public class ch2ex27 {
    public static void main(String[] args) {

        //show dialog box
        String input1 = JOptionPane.showInputDialog("Enter investment amount");

        //parse double amount
        double investmentAmount = Double.parseDouble(input1);

        //show dialog box
        String input2 = JOptionPane.showInputDialog("Enter monthly interest rate in %");
        double monthlyInterestRate = Double.parseDouble(input2) / 100;

        //show dialog box
        String input3 = JOptionPane.showInputDialog("Enter number of years");
        int numberOfYears = Integer.parseInt(input3) * 12;

        double futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyInterestRate / 1200), (numberOfYears * 12)));
        String output = "Future investment value is " + futureInvestmentValue;
        JOptionPane.showMessageDialog(null, output);

    }
}