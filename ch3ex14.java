import java.util.Random;
import java.util.Scanner;

//Game: heads or tails
/*
Write a program that lets the user guess whether the flip of
a coin results in heads or tails. The program randomly generates an integer 0 or 1,
which represents head or tail. The program prompts the user to enter a guess and
reports whether the guess is correct or incorrect.
 */
public class ch3ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 for head or 1 for tail: ");
        int userChoice = input.nextInt();



        int systemChoice = (int)(Math.random()*((1-0)+1))+0;

        if(userChoice == systemChoice){
            System.out.println("You are correct");
        }
        else{
            System.out.println("You are incorrect");
        }


    }
}
