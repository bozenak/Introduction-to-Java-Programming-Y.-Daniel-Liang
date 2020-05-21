import javax.swing.*;

//Sort three integers
/*
Write a program that sorts three integers. The integers are
entered from input dialog box and stored in num1, num2, and num3
The program sorts the numbers so that num1 >= num2 >= num3
 */
public class ch3ex8 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter 1st integer: ");
        int num1 = Integer.parseInt(input1);
        String input2 = JOptionPane.showInputDialog("Enter 2nd integer: ");
        int num2 = Integer.parseInt(input2);
        String input3 = JOptionPane.showInputDialog("Enter 3rd integer: ");
        int num3 = Integer.parseInt(input3);

        int temp;

        if (num1 <= num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2 <= num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if(num1 <= num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println(num1 +" " + num2 + " " + num3);
    }
}
