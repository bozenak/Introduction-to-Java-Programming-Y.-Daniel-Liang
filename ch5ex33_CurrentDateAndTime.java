import java.time.LocalDate;

/*
Invoking System.currentTimeMillis() returns the
elapsed time in milliseconds since midnight of January 1, 1970. Write a program
that displays the date and time. Here is a sample run:
Current date and time is May 16, 2012 10:34:23
 */
public class ch5ex33_CurrentDateAndTime {
    public static void main(String[] args) {

        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        //System.out.println( currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
        //System.out.println((currentHours + 1)  + ":" + currentMinutes + ":" + currentSeconds + " IST");
        System.out.println("Current date and time is " + getDate(totalHours) + (currentHours + 1) +
              ":" + currentMinutes + ":" + currentSeconds + " IST" );
    }

    public static String getDate(long totalHours) {
        String date;
        long totalDays = totalHours / 24;
        int startYear = 1970;
        int dayReduction = 0;

        while(totalDays>0){
            if (isLeapYear(startYear)){
                dayReduction = 366;
                totalDays -=366;
            }
            else{
                dayReduction = 365;
                totalDays -=365;
            }
            startYear++;
        }
        totalDays +=dayReduction;
        startYear--;

        return getMonthAndDay(totalDays, startYear) + " " + startYear + " ";

    }

    public static String getMonthAndDay(long numberOfDays, int year) {
        int dayReduction = 0;
        int month;
        for(month = 1; month <=12; month++){
            dayReduction = getNumberOfDaysInMonth(year, month);
            numberOfDays -=dayReduction;
            if(numberOfDays <0)
                break;
        }
        numberOfDays += dayReduction;
        return getMonthName(month) + " " +  numberOfDays + ",";
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2)
            return isLeapYear(year) ? 29 : 28;

        return 0; // incorrect month
    }

    /** Determine if it is a leap year */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }



    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }

        return monthName;
    }
}
