import java.util.Scanner;

//Find the number of days in a month
/*
Write a program that prompts the user
to enter the month and year
and displays the number of days in the month.
For example, if the user entered month 2 and year 2012, the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days.
 */
public class ch3ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter: \n" +
                "1 for January \n" + "2 for February \n" + "3 for March\n" +
                "4 for April\n" + "5 for May\n" + "6 for June\n" +
                "7 for July\n" + "8 for August\n" + "9 for September\n" +
                "10 for October\n" + "11 for November\n" + "12 for December\n");

        int month = input.nextInt();
        System.out.println( "Enter year: ");
        int year = input.nextInt();
        int days;
        if ((month==1) || (month == 3) || (month == 5) || (month == 7) || (month == 8)
                || (month == 10) || (month == 12) ) {
            days = 31;
            switch (month) {
                case 1:
                    System.out.println("January " + "of " + year + " had " + days + " days");
                    break;
                case 3:
                    System.out.println("March " + "of " + year + " had " + days + " days");
                    break;
                case 5:
                    System.out.println("May " + "of " + year + " had " + days + " days");
                    break;
                case 7:
                    System.out.println("July " + "of " + year + " had " + days + " days");
                    break;
                case 8:
                    System.out.println("August " + "of " + year + " had " + days + " days");
                    break;
                case 10:
                    System.out.println("October " + "of " + year + " had " + days + " days");
                    break;
                case 12:
                    System.out.println("December " + "of " + year + " had " + days + " days");
                    break;
            }
        }
        else if ((month==4) || (month ==6) || (month == 9) || (month == 11) ) {
            days = 30;
            switch (month) {
                case 4:
                    System.out.println("April " + "of " + year + " had " + days + " days");
                    break;
                case 6:
                    System.out.println("June " + "of " + year + " had " + days + " days");
                    break;
                case 9:
                    System.out.println("September " + "of " + year + " had " + days + " days");
                    break;
                case 11:
                    System.out.println("November " + "of " + year + " had " + days + " days");
                    break;
            }
        }
        else if((month==2 && year % 400 == 0) || (month == 2 && year % 4 == 0 && year % 100 !=0)){
            days = 29;
            System.out.println("February " + "of " + year + " had " + days + " days");
        }
        else {
                days = 28;
                System.out.println("February " + "of " + year + " had " + days + " days");

            }


        
    }
}
