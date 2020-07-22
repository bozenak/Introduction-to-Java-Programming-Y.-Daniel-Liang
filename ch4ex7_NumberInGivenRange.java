import java.util.Scanner;

/*
Write a program that prompts the user to enter lower and upper bound,
and displays all the numbers in that range.
example:
Enter the lower bound: 5
Enter the upper bound: 10
5 6 7 8 9 10
 */
public class ch4ex7_NumberInGivenRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lower bound: ");
        int lowerBound = input.nextInt();
        System.out.println("Enter the upper bound: ");
        int upperBound = input.nextInt();


        System.out.println("Do-While loop");
        do{
            System.out.print(lowerBound + " ");
            lowerBound++;
        }while (lowerBound <= upperBound);

       /* System.out.println("While loop");
        while (lowerBound <= upperBound){
            System.out.print(lowerBound + " ");
            lowerBound++;
        }*/

        /*System.out.println("For loop");
        for( ; lowerBound <= upperBound; lowerBound++){
            System.out.print(lowerBound + " ");
        }*/
    }
}
