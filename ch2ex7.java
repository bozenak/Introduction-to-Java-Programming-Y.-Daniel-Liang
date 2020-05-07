//Find the number of days
/*
Write a program that prompts the user to enter the seconds
 (e.g., 1 million), and displays the number of days and minutes for the seconds.
 assume a year has 365 days.
 Here is a sample run:
 Enter the number of seconds: 86520
 86520 seconds is approximately 1 days and 2 minutes
 */

import java.util.Scanner;

public class ch2ex7 {
    public static void main(String[] args) {
        System.out.print("Enter the number of seconds: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        //declare days and reminding minutes
        // there is 86400 seconds in 24 h
        int numDays, numMinutes;

        //calculate number of days and number of minutes in reminding seconds
        numDays = userInput / 86400;
        numMinutes = (userInput % 86400) / 60 ;

        //display number of days and number of minutes in given seconds
        System.out.println("There is " + numDays + " Days and  " + numMinutes + " minutes in "
        + userInput + " seconds.");

    }
}
