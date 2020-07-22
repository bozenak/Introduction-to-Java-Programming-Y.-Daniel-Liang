import java.util.Scanner;

/*
Write a program that reads an integer and displays
its smallest prime factors in ascending order.
example:
 if the input integer is 60,
 the output should be as follows: 2, 3, 5.
 */
public class ch4ex16_FindPrimeFactorsOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int userInput = input.nextInt();

        int divisor = 2;


        for( divisor = 2 ; divisor < userInput; divisor++){
            while (userInput % divisor == 0){
                System.out.println(divisor + ",");
                userInput = userInput /divisor;

            }
            if (userInput > 2){
                System.out.println(userInput);
            }
        }


    }
}
