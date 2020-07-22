import java.util.Scanner;

/*
Write a method that prints characters using the following header:
public static void printChars(char ch1, char ch2, int numberPerLine)

This method prints the character between ch1 and ch2 with a specified
numbers per line.
Write a test program that prints 10 characters per line from 1 to Z.
Characters are separated by exactly one space.
 */
public class ch5ex12_DisplayCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character to start with, character to end with, " +
                "end the number of characters per line: ");

        printChars(input.next().charAt(0), input.next().charAt(0), input.nextInt());

    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int asciiCh1 = ch1;
        int asciiCh2 = ch2;
        int count = 0;

        for (int ch = asciiCh1; ch <= asciiCh2; ch++) {
            System.out.printf((char) ch + " ");
            count++;
            if (count % numberPerLine == 0)
                System.out.println();
        }
    }
}
