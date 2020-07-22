import java.util.Scanner;

public class ch4ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines: ");

        final int numberOfLines = input.nextInt();
        int newNumOfLines = numberOfLines;
        int displayNum = numberOfLines;
        int rowNum = 0;
        String space = "    ";


        while(rowNum >= 0 && displayNum > 0 ){
        do {
            System.out.printf("%4d", displayNum);
            displayNum--;
        } while (displayNum > 0);
        //displayNum = displayNum + 1;

        for (displayNum = 2; displayNum <= newNumOfLines; displayNum++) {
            //displayNum++;
            newNumOfLines = numberOfLines - rowNum;
            System.out.printf("%4d", displayNum);

        }



            rowNum++;
            displayNum = numberOfLines - rowNum;


            System.out.print("\n");
            System.out.print(space);
            space = space + "    ";
        }




    }
}
