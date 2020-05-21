import java.util.Scanner;

//Game: scissor, rock, paper
/*
Write a program that plays the popular scissor-rock-paper
game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws.
example
scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won

scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw
 */
public class ch3ex17 {
    public static void main(String[] args) {
        int generatedNum = (int)(Math.random() * ((2-0) +1) +0);
        String computerChoice = "";
        switch (generatedNum){
            case 0: computerChoice = "Scissor";
            break;
            case 1: computerChoice = "Rock";
            break;
            case 2: computerChoice = "Paper";
            break;
        }
        //System.out.println(generatedNum + "" + computerChoice);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter: \n 0 for scissor \n 1 for rock \n 2 for paper");
        int userNum = input.nextInt();
        String userChoice = "";
        switch (userNum){
            case 0: userChoice = "Scissor";
                break;
            case 1: userChoice = "Rock";
                break;
            case 2: userChoice = "Paper";
                break;
        }
        if((userNum == 0 && generatedNum == 0) || (userNum == 1 && generatedNum == 1) ||
                (userNum == 2 && generatedNum == 2)){
            System.out.println("The computer is " + computerChoice + ". You are " + userChoice + " too. It is a draw.");
        }
        else if((userNum == 0 && generatedNum == 2) ||
                (userNum == 1 && generatedNum == 0) ||
                (userNum == 2 && generatedNum == 1)){
            System.out.println("The computer is " + computerChoice + ". You are " + userChoice + " You won !");
        }
        else{
            System.out.println("The computer is " + computerChoice + ". You are " + userChoice + " You lost !");
        }



    }
}
