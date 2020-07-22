/*
Write a method that returns the number of days in a
year using the following header:
public static int numberOfDaysInAYear(int year)
Write a test program that displays the number of days in a year from 2000 to 2020.tggg
 */
public class ch5ex16_NumberOfDaysInAYear {
    public static void main(String[] args) {
        int year = 0;
        System.out.println("Year        Number of days");
        System.out.println("--------------------------");
        for(year=2000; year <= 2020; year ++){
            System.out.printf("%-12d", year);
            System.out.print(numberOfDaysInAYear(year));
            System.out.println();
        }

    }
    public static int numberOfDaysInAYear(int year){
        int numberOfDays = 0;
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 !=0))
            numberOfDays = 366; //if it's a leap year display 366 days
        else
            numberOfDays = 365;

        return numberOfDays;
    }
}
