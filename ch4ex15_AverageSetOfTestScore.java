import java.util.Scanner;

/*
Write a program that averages a set of four test score of a students.
After average is displayed, a program should ask the user
if another set of test score is to be averaged.
Use a do-while loop to make sure a loop executes at least once.
 */
public class ch4ex15_AverageSetOfTestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char doItAgain = 'y';

        do {
            System.out.println("Enter scores: ");

            double score1 = input.nextDouble();
            double score2 = input.nextDouble();
            double score3 = input.nextDouble();
            double score4 = input.nextDouble();

            double average = (score1 + score2 + score3 + score4) / 4;


            System.out.println("The average score is " + average);
            System.out.println("Would you like todo it again? Y/N: ");
            doItAgain = input.next().charAt(0);

        }while(doItAgain == 'y' || doItAgain == 'Y');
    }
}
