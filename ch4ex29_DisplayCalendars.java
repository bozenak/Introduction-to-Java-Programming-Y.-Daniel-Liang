import java.util.Scanner;

/*
Write a program that prompts the user to enter the year and
first day of the year and displays the calendar table for the year on the console.
For example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
your program should display the calendar for each month in the year, as follows:
        January 2013
---------------------------
Sun Mon Tue Wed Thu Fri Sat
        1   2   3   4   5
6   7   8   9   10  11  12
13  14  15  16  17  18  19
20  21  22  23  24  25  26
27  28  29  30  31

        December 2013
---------------------------
Sun Mon Tue Wed Thu Fri Sat
1   2   3   4   5   6   7
8   9   10  11  12  13  14
15  16  17  18  19  20  21
22  23  24  25  26  27  28
29  30  31
 */
public class ch4ex29_DisplayCalendars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year and the day, 0 for Sun, 1 for Mon...: ");
        int year = input.nextInt();
        int day = input.nextInt(); //day of the week to start a month
        int month = 0, dayToDisplay = 0, numOfDaysInMonth;
        String stringMonth = "";
        String space = "    "; //four spaces

        //run loop for each month
        for (month = 1; month <= 12; month++) {

            //string month
            if(month == 1){
                stringMonth = "January"; //name of the month
                numOfDaysInMonth = 31; //number of days in month
            }
            else if(month == 2){
                stringMonth = "February";
                if((month==2 && year % 400 == 0) || (month == 2 && year % 4 == 0 && year % 100 !=0)){
                    numOfDaysInMonth = 29; //if it's a leap year display 29 days
                }
                else{
                    numOfDaysInMonth = 28;
                }
            }
            else if(month == 3){
                stringMonth = "March";
                numOfDaysInMonth = 31;
            }
            else if(month == 4){
                stringMonth = "April";
                numOfDaysInMonth = 30;
            }
            else if(month == 5){
                stringMonth = "May";
                numOfDaysInMonth = 31;
            }
            else if(month == 6){
                stringMonth = "June";
                numOfDaysInMonth = 30;
            }
            else if(month == 7){
                stringMonth = "July";
                numOfDaysInMonth = 31;
            }
            else if(month == 8){
                stringMonth = "August";
                numOfDaysInMonth = 31;
            }
            else if(month == 9){
                stringMonth = "September";
                numOfDaysInMonth = 31;
            }
            else if(month == 10){
                stringMonth = "October";
                numOfDaysInMonth = 31;
            }
            else if(month == 11){
                stringMonth = "November";
                numOfDaysInMonth = 30;
            }
            else {
                stringMonth = "December";
                numOfDaysInMonth = 31;
            }

            System.out.print(space);
            System.out.print(space); //center justify month and year
            System.out.print(stringMonth + " ");
            System.out.println(year);
            System.out.println("----------------------------");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            //space before the day starts
            for( int i=0; i<day;i++){
                System.out.print(space);
            }

            //display days in the month
            for(dayToDisplay=1; dayToDisplay<=numOfDaysInMonth; dayToDisplay++ ) {
                System.out.print(" ");
                System.out.printf("%-3d", dayToDisplay);

                //if day + start day % 7 == 0, move to the next line
                if ((dayToDisplay + day) % 7  == 0){
                    System.out.println();
                }
            }

            //move to the next line
            System.out.println();

            //reset the start day for next month to 0
            day = (day + numOfDaysInMonth) % 7;

            System.out.print("\n");

        }
    }
}