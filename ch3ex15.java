import java.util.Scanner;

//Game: lottery
/*
Revise Listing 3.9, Lottery.java, to generate a lottery of a three-digit
number. The program prompts the user to enter a three-digit number and
determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is
$10,000.
2. If all digits in the user input match all digits in the lottery number, the award is
$3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is
$1,000.
 */
public class ch3ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3-digit numbers: ");
        int userNumber = input.nextInt();
        //System.out.println(userNumber);
        int userNum1 = userNumber / 100;
        userNumber = userNumber % 100;
        int userNum2 = userNumber / 10;
        userNumber = userNumber % 10;
        int userNum3 = userNumber;
        //System.out.println(userNum1 + " " + userNum2 + " " + userNum3 );

        //generate 3-digit number
        int generatedNum = (int)(Math.random() * 1000);
        System.out.println(generatedNum);

        //execute 1st, 2nd and 3rd number
        int genNum1 = generatedNum / 100;
        generatedNum = generatedNum % 100;
        int genNum2 = generatedNum / 10;
        generatedNum = generatedNum % 10;
        int genNum3 = generatedNum;
        // System.out.println(genNum1 + " " + genNum2 + " " + genNum3);

        if (userNum1 == genNum1 && userNum2 == genNum2 && userNum3 == genNum3){
            System.out.println("You won 10 000 $");
        }
        else if ((userNum1 == genNum2 || userNum1 == genNum3) && (userNum2 == genNum1 || userNum2 == genNum3) &&
                (userNum3 == genNum1 || userNum3 == genNum2)){
            System.out.println("You won 3000 $" );
        }
        else if ((userNum1 == genNum1 || userNum1 == genNum2 || userNum1 == genNum3) ||
                (userNum2 == genNum1 || userNum2 == genNum2 || userNum2 == genNum3) ||
                (userNum3 == genNum1 || userNum3 == genNum2 || userNum3 == genNum3)){
            System.out.println("You won 1000 $");
        }
        else{
            System.out.println("You didn't won anything");
        }




    }
}
