import java.util.Scanner;

//Science: day of the week
/*
Zeller’s congruence is an algorithm developed by
Christian Zeller to calculate the day of the week.
Write a program
that prompts the user to enter a year, month, and day of the month, and
displays the name of the day of the week.
example:
Enter year: (e.g., 2012): 2015
Enter month: 1-12: 1
Enter the day of the month: 1-31: 25
Day of the week is Sunday

Enter year: (e.g., 2012): 2012
Enter month: 1-12: 5
Enter the day of the month: 1-31: 12
Day of the week is Saturday

(Hint: January and February are counted as 13 and 14 in the formula, so you need
to convert the user input 1 to 13 and 2 to 14 for the month and change the year to
the previous year.)
 */
public class ch3ex21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: (e.g., 2012): ");
        int inputYear = input.nextInt();

        System.out.println("Enter month: 1-12: ");
        int inputMonth = input.nextInt();


        System.out.println("Enter the day of the month: 1-31: ");
        int inputDay = input.nextInt();

        int month, year;
        if(inputMonth == 1){
            month = 13;
            year = inputYear - 1;
        }
        else if (inputMonth == 2){
            month = 14;
            year = inputYear - 1;
        }
        else{
            month = inputMonth;
            year = inputYear;
        }

        int day, century;
        year = year % 100;
        century = inputYear / 100;

        day = (inputDay + ((26 * (month + 1)) / 10) + year + (year / 4) + (century / 4) +
                (5 * century)) % 7;
        String dayOfTheWeek = "";
        switch(day){
            case 0: dayOfTheWeek = "Saturday";
            break;
            case 1: dayOfTheWeek = "Sunday";
            break;
            case 2: dayOfTheWeek = "Monday";
            break;
            case 3: dayOfTheWeek = "Tuesday";
            break;
            case 4: dayOfTheWeek = "Wednesday";
            break;
            case 5: dayOfTheWeek = "Thursday";
            break;
            case 6: dayOfTheWeek = "Friday";
            break;
        }



        System.out.println("Day of the week is: " + dayOfTheWeek);

    }
}
