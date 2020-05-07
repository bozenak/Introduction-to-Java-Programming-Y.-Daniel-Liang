import java.util.Scanner;
// convert bits into byte
/*write a program that reads a number in bits, converts it to bytes
and display the results.
1 byte = 8 bits

example:
64 bits = 8 bytes
 */
public class ch2ex3 {
    public static void main(String[] args) {
        int bit;
        System.out.println("Enter number of bits: ");
        Scanner input = new Scanner(System.in);
        bit = input.nextInt();
        int mbyte = bit / 8;
        System.out.println(bit + " " + "bits = " + mbyte + " " + "bytes");

    }
}
