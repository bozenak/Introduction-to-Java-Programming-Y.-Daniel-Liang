import java.util.Scanner;

/*
Write a method that converts
milliseconds to hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds.
For example,
convertMillis(5500) returns a string 0:0:5
convertMillis(100000) returns a string 0:1:40
convertMillis(555550000) returns a string 154:19:10.
Write a test program that prompts the user to enter a long integer for
milliseconds and displays a string in the format of hours:minutes:seconds.
 */
public class ch5ex25_ConvertMillisecondsToHoursMinutesAndSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a long integer for milliseconds: ");
        long milliSec = input.nextLong();
        //convertMillis(milliSec);

        System.out.print(convertMillis(milliSec));

    }
    public static String convertMillis(long millis){
        String s = " ";
        int h = (int) millis / 3600000;
        int min = (int)(millis % 3600000) / 60000;
        int sec = (int) ((millis % 3600000) % 60000) / 1000 ;
        s = h + ":" + min + ":" + sec;
        return s;
    }
}
