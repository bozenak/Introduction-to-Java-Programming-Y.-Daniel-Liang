import java.util.Scanner;

/*
Write a program that prompts the user to enter a binary number
 and displays its equivalent in decimal number.
 */
public class ch4ex37_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        int binaryNum = input.nextInt();
        int originalBinaryNum = binaryNum;
        int remainder;
        double decimalNum=0;
        int e = 0; //exponent

        while(binaryNum >0){
            remainder = binaryNum % 2; // 0 or 1
            decimalNum = decimalNum + (remainder * Math.pow(2,e));
            e++;
            binaryNum = binaryNum / 10;
        }
        System.out.print(originalBinaryNum + " is " + (int)decimalNum + " in decimal ");

    }
}
