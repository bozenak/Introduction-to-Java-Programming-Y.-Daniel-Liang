import java.time.LocalDate;

/*
Listing 2.6, ShowCurrentTime.java, displays the current time.
Revise this example to display the current date and time.
The calendar example in Listing 5.12, PrintCalendar.java, should give you some ideas on
how to find the year, month, and day.
 */
public class ch5ex24_DisplayCurrentDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // Create a date object
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.println(date + " " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
        System.out.println(date + " " + (currentHours + 1)  + ":" + currentMinutes + ":" + currentSeconds + " IST");
    }
}
