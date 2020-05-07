import java.util.Scanner;

//display first, middle and last name
/*
Write a program that has the following String variable:
firstName, middleName, lastName
The program should prompt the user to enter fist, middle and last name,
and display the content of variable on the screen.

example output:
The name entered is John Adam Smith
 */
public class ch2ex8 {
    public static void main(String[] args) {
        String firstName, middleName, lastName;

        System.out.print("Enter the fist second and last name: ");
        Scanner input = new Scanner(System.in);
        firstName = input.next();
        middleName = input.next();
        lastName = input.next();

        System.out.println("Entered name is: " + firstName + " " + middleName + " " + lastName);

    }
}
