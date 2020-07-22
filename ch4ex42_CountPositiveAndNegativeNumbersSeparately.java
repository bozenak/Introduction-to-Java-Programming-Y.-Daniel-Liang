import java.util.Scanner;

/*
Write a program that prompt the user to enter set of numbers.
The program should count the number of positive and negative
numbers separately along with their sum.
The program should terminate when 0 is entered.
 */
public class ch4ex42_CountPositiveAndNegativeNumbersSeparately {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter integer numbers: ");
            int num = 0;
            int sumPositives = 0;
            int sumNegatives = 0;
            int countPositives=0;
            int countNegatives =0;
            do {
                num = input.nextInt();

                if(num > 0){
                    countPositives++;
                    sumPositives = sumPositives + num;
                }
                if (num < 0){
                    countNegatives++;
                    sumNegatives = sumNegatives + num;
                }
            }while (num != 0);
            System.out.println("The sum of positive numbers is " + sumPositives +
                    ". There was " + countPositives + " numbers.");
        System.out.println("The sum of negative numbers is " + sumNegatives +
                ". There was " + countNegatives+ " numbers.");
        }
    }

