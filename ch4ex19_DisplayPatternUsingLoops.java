import java.util.Scanner;

/*
Write a nested for loop that prints the following output,
up to the n-th term, where n is given by the user:
1
2       4
3       6       9
4       8       12      16
n
 */
public class ch4ex19_DisplayPatternUsingLoops {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        final int numOfRows = userInput.nextInt(); // number of rows entered by user
        int i; // line number
        int j; // column number

        for(i = 1; i <= numOfRows; i++){
            int num = i;

            for(j = 1; j <= i; j++){
                System.out.printf("%-8d", num );
                num = num + i; //number to display
            }
            System.out.print("\n");
        }

    }
}
