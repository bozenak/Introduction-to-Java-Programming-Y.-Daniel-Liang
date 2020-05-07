//Display the current time in the hour:minute:second format
/*
Write a program that displays current time
in the hour:minute:second format
using System.CurrentTimeMills() method
 */
public class ch2ex22 {
    public static void main(String[] args) {
        long totalMiliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMiliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.println(currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
        System.out.println(currentHours + 1  + ":" + currentMinutes + ":" + currentSeconds + " IST");

    }
}
