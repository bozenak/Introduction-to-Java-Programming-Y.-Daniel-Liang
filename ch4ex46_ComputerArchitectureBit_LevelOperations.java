import java.util.Scanner;

/*

A short value is stored in 16 bits.
Write a program that prompts the user to enter a short integer
and displays the 16 bits for the integer.
(Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND
operator (&), which are covered in Appendix G, Bitwise Operations.)

Here are sample runs:
Enter an integer: 5
The bits are 0000000000000101

Enter an integer: -5
The bits are 1111111111111011
 */
public class ch4ex46_ComputerArchitectureBit_LevelOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter short number: ");
        short number = input.nextShort();

        String binaryNum = Integer.toBinaryString(number);

        System.out.print(binaryNum);





    }
}







