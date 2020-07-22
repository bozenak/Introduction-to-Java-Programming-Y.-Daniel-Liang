import javax.swing.*;

/*
Craps is a popular dice game played in casinos.
Write a program to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respectively.
Check the sum of the two dice.
If the sum is 2, 3, or 12 (called craps), you lose;
If the sum is 7 or 11 (called natural), you win;
If the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established.
Continue to roll the dice until either a 7 or the same point value is rolled.
If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player. Here are some sample runs:

You rolled 5 + 6 = 11
You win

You rolled 1 + 2 = 3
You lose

You rolled 4 + 4 = 8
point is 8

You rolled 6 + 2 = 8
You win

You rolled 3 + 2 = 5
point is 5

You rolled 2 + 5 = 7
You lose
 */
public class ch5ex30_GameCraps {
    public static void main(String[] args) {
        int dice1 = 0, dice2 = 0, sum = 0;

        //game
            dice1 = rollDice1(dice1);
            dice2 = rollDice2(dice2);
            sum = sum(dice1, dice2);
            System.out.println(dice1 + " + " + dice2 + " = " + sum);

            if (lose(sum) == true) {
                System.out.println("You lose");
            }

            else if (win(sum) == true) {
                System.out.println("You win");
            }

            else{
                point(sum);
               /* int point = sum;
                System.out.println("point is " + point);
                do {
                    dice1 = rollDice1(dice1);
                    dice2 = rollDice2(dice2);
                    sum = sum(dice1, dice2);
                    System.out.println(dice1 + " + " + dice2 + " = " + sum);
                    if (sum == 7) {
                        System.out.println("lose");
                        break;
                    }
                    if (sum == point){
                        System.out.println("win");
                        break;
                    }
                } while (sum != 7 || point != sum);*/
            }




    }

    public static int rollDice1(int num) {
        return (int) (1 + Math.random() * 6);
    }

    public static int rollDice2(int num) {
        return (int) (1 + Math.random() * 6);
    }

    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static boolean lose(int sum) {
        if (sum == 2 || sum == 3 || sum == 12)
            return true;
        else
            return false;
    }

    public static boolean win(int sum) {
        if (sum == 7 || sum == 11)
            return true;
        else
            return false;
    }
    public static void point(int num){
        int dice1=0; int dice2=0; int sum=0; int point = 0;

        do {
            dice1 = rollDice1(dice1);
            dice2 = rollDice2(dice2);
            sum = sum(dice1, dice2);
            point = sum;
            System.out.println("point is " + point);
            System.out.println(dice1 + " + " + dice2 + " = " + sum);
            if (sum == 7) {
                System.out.println("lose");
                break;
            }
            if (sum == point){
                System.out.println("win");
                break;
            }
        } while (sum != 7 || point != sum);
    }

}
