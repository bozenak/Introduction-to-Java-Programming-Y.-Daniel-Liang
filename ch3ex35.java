import java.util.Scanner;

//Decimal to hex
/*
Write a program that prompt the user to enter integer between 0 and 15,
and display it's corresponding hex number.
example:
Enter decimal value from 0 to 15: 11
The hex value is B

Enter decimal value from 0 to 15: 5
The hex value is 5

Enter decimal value from 0 to 15: 31
Invalid input
 */
public class ch3ex35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal value from 0 to 15: ");
        int numInteger = input.nextInt();

        int numHex;
        char hex;
        if(numInteger >=0 && numInteger <=9){
            numHex = numInteger;
            System.out.println("The hex value is " + numHex);
        }
        else if (numInteger == 10){
            hex = 'A';
            System.out.println("The hex value is " + hex);
        }
        else if (numInteger == 11){
            hex = 'B';
            System.out.println("The hex value is " + hex);
        }
        else if (numInteger == 12){
            hex = 'C';
            System.out.println("The hex value is " + hex);
        }
        else if (numInteger == 13){
            hex = 'D';
            System.out.println("The hex value is " + hex);
        }
        else if (numInteger == 14){
            hex = 'E';
            System.out.println("The hex value is " + hex);
        }
        else if (numInteger == 15){
            hex = 'F';
            System.out.println("The hex value is " + hex);
        }
        else{
            System.out.println("invalid input");
        }
    }
}
