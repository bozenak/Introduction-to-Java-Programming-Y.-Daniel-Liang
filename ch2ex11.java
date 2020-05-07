import java.util.Scanner;

//Percentage of marks
/*
Write a program that prompts the user to enter examination score of student
and the full marks for the examination,
print the percentage  of marks obtained.
example:
Full marks = 500
Obtained marks = 400
400 out of 500 = 80 %
 */
public class ch2ex11 {
    public static void main(String[] args) {
        double fullMarks, obtainedMarks, overallPercentage;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full marks: ");
        fullMarks = input.nextDouble();
        System.out.print("Enter obtained marks: ");
        obtainedMarks = input.nextDouble();
        overallPercentage = obtainedMarks / fullMarks;
        System.out.println("Overall percentage score is: " + overallPercentage * 100 + "%");



    }



}
