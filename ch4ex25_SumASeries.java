import java.util.Scanner;

/*
Write the program to sum the following series:
1 + (1 + 2) + ( 1 + 2 + 3) + .... + (1 + 2 + 3 + .... + n)
n is given by the user at the time of execution
 */
public class ch4ex25_SumASeries {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = userInput.nextInt();

        int sum = 0;
        int sum2 = sum;


        for( int i = 1; i <= n; i++){
            sum = sum + i;
            sum2 = sum2 + sum;
        }
        System.out.println(sum2);
    }
}
