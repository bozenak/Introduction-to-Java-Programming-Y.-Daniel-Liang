/*

Write a program that prompts the user to enter an integer from
1 to 9 and displays a pyramid, as shown in the following sample run:
example:
Enter the number of lines:
5  4  3  2  1  2  3  4  5
   4  3  2  1  2  3  4
      3  2  1  2  3
         2  1  2
            1
 */

import java.util.Scanner;

public class ch4ex17_DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines: ");

        int numberOfLines = input.nextInt();
        int newNumOfLines = numberOfLines;
        int displayNum = numberOfLines;
        int rowNum = 0;


        do {
            System.out.printf("%4d", displayNum);
            displayNum--;
        } while (displayNum >= 1);
        displayNum = displayNum + 1;
        for (displayNum++; displayNum <= numberOfLines; displayNum++) {
            //displayNum++;
            newNumOfLines--;
            System.out.printf("%4d", displayNum);
        }


        rowNum++;
        displayNum = numberOfLines - rowNum;
        if (rowNum > 0 && displayNum > 0) {
            System.out.print("\n");
            System.out.print("    ");
            do {
                System.out.printf("%4d", displayNum);
                displayNum--;
            } while (displayNum >= 1);
            displayNum = displayNum + 1;
            newNumOfLines = numberOfLines - rowNum;
            for (displayNum++; displayNum <= newNumOfLines; displayNum++) {
                System.out.printf("%4d", displayNum);
            }



            rowNum++;
            displayNum = numberOfLines - rowNum;
            if (rowNum > 0 && displayNum > 0) {
                System.out.print("\n");
                System.out.print("    " + "    ");
                do {
                    System.out.printf("%4d", displayNum);
                    displayNum--;
                } while (displayNum >= 1);
                displayNum = displayNum + 1;
                newNumOfLines = numberOfLines - rowNum;
                for (displayNum++; displayNum <= newNumOfLines; displayNum++) {
                    //displayNum++;
                    System.out.printf("%4d", displayNum);
                }
            }



            rowNum++;
            displayNum = numberOfLines - rowNum;
            if (rowNum > 0 && displayNum > 0 ) {
                System.out.print("\n");
                System.out.print("    " + "    " + "    ");
                do {
                    System.out.printf("%4d", displayNum);
                    displayNum--;
                } while (displayNum >= 1);
                displayNum = displayNum + 1;
                newNumOfLines = numberOfLines - rowNum;
                for (displayNum++; displayNum <= newNumOfLines; displayNum++) {
                    //displayNum++;
                    System.out.printf("%4d", displayNum);
                }
            }



            rowNum++;
            displayNum = numberOfLines - rowNum;
            if (rowNum > 0 && displayNum > 0 ) {
                System.out.print("\n");
                System.out.print("    " + "    " + "    " + "    ");
                do {
                    System.out.printf("%4d", displayNum);
                    displayNum--;
                } while (displayNum >= 1);
                displayNum = displayNum + 1;
                newNumOfLines = numberOfLines - rowNum;
                for (displayNum++; displayNum <= newNumOfLines; displayNum++) {
                    //displayNum++;
                    System.out.printf("%4d", displayNum);
                }
            }



            rowNum++;
            displayNum = numberOfLines - rowNum;
            if (rowNum > 0 && displayNum > 0) {
                System.out.print("\n");
                System.out.print("    " + "    " + "    " + "    " + "    ");
                do {
                    System.out.printf("%4d", displayNum);
                    displayNum--;
                } while (displayNum >= 1);
                displayNum = displayNum + 1;
                newNumOfLines = numberOfLines - rowNum;
                for (displayNum++; displayNum <= newNumOfLines; displayNum++) {
                    //displayNum++;
                    System.out.printf("%4d", displayNum);
                }
            }



            rowNum++;
            displayNum = numberOfLines - rowNum;
            if (rowNum > 0 && displayNum > 0) {
                System.out.print("\n");
                System.out.print("    " + "    " + "    " + "    " + "    " + "    ");
                do {
                    System.out.printf("%4d", displayNum);
                    displayNum--;
                } while (displayNum >= 1);
                displayNum = displayNum + 1;
                newNumOfLines = numberOfLines - rowNum;
                for (displayNum++; displayNum <= newNumOfLines; displayNum++) {
                    //displayNum++;
                    System.out.printf("%4d", displayNum);
                }
            }



            rowNum++;
            displayNum = numberOfLines - rowNum;
            if (rowNum > 0 && displayNum > 0 ) {
                System.out.print("\n");
                System.out.print("    " + "    " + "    " + "    " + "    " + "    " + "    ");
                do {
                    System.out.printf("%4d", displayNum);
                    displayNum--;
                } while (displayNum >= 1);
                displayNum = displayNum + 1;
                newNumOfLines = numberOfLines - rowNum;
                for (displayNum++; displayNum <= newNumOfLines; displayNum++) {
                    //displayNum++;
                    System.out.printf("%4d", displayNum);
                }
            }



            rowNum++;
            displayNum = numberOfLines - rowNum;
            if (rowNum > 0 && displayNum > 0) {
                System.out.print("\n");
                System.out.print("    " + "    " + "    " + "    " + "    " + "    " + "    " + "    ");
                do {
                    System.out.printf("%4d", displayNum);
                    displayNum--;
                } while (displayNum >= 1);
                displayNum = displayNum + 1;
                newNumOfLines = numberOfLines - rowNum;
                for (displayNum++; displayNum <= newNumOfLines; displayNum++) {
                    //displayNum++;
                    System.out.printf("%4d", displayNum);
                }
            }


        }
    }
}







