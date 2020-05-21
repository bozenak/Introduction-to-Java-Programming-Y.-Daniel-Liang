import javax.swing.*;
import java.util.Scanner;

//Find future dates
/*
Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week.
example:
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
Enter today's day: 0
Enter the number of days elapsed since today: 31
Today is Sunday and the future day is Wednesday
 */
public class ch3ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the day of the week, enter:" +
        "\n 0 for Sunday" + "\n 1 for Monday" + "\n 2 for Tuesday" +
        "\n 3 for Wednesday" + "\n 4 for Thursday" + "\n 5 for Friday" +
        "\n 6 for Saturday");
        int userInput = input.nextInt();
        String dayOfTheWeek = "";

        System.out.println("enter the number of days after today for a future day: ");
        int userNumOfDays = input.nextInt();


       if (userInput == 0) {
           dayOfTheWeek = "Sunday";
        }
       else if (userInput == 1) {
           dayOfTheWeek = "Monday";
        }
       else if (userInput == 2) {
           dayOfTheWeek = "Tuesday";
       }
       else if (userInput == 3) {
           dayOfTheWeek = "Wednesday";
       }
       else if (userInput == 4) {
           dayOfTheWeek = "Thursday";
       }
       else if (userInput == 5) {
           dayOfTheWeek = "Friday";
       }
       else {
           dayOfTheWeek = "Saturday";
       }


        String futureDay = "";
       if ((userInput + userNumOfDays) % 7 == 0){
           futureDay= "Sunday";
       }
       else if ((userInput + userNumOfDays) % 7 == 1){
            futureDay= "Monday";
        }
       else if ((userInput + userNumOfDays) % 7 == 2){
            futureDay= "Tuesday";
        }
       else if ((userInput + userNumOfDays) % 7 == 3){
            futureDay= "Wednesday";
        }
       else if ((userInput + userNumOfDays) % 7 == 4){
            futureDay= "Thursday";
        }
       else if ((userInput + userNumOfDays) % 7 == 5){
            futureDay= "Friday";
        }
       else {
            futureDay= "Saturday";
        }

        System.out.println("Today is " + dayOfTheWeek + " and in: " + userNumOfDays +
                " days will be: " + futureDay);


    }
}
