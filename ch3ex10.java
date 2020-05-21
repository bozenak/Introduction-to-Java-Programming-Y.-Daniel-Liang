import java.util.Scanner;

//Game: division quiz)
/*
Listing 3.4, SubtractionQuiz.java, randomly generates a
subtraction question.
Revise the program to randomly generate an division question
with two integers less than 1000.
 */
public class ch3ex10 {
    public static void main(String[] args) {
        //generates two random integers less then 1000
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 1000);

        //if the num1 < num2 swap the num1 with num2
        int temp;
        if (num1 < num2){
            temp = num1;
            num2 = num1;
            num1 = temp;
        }
        System.out.println("What is: " + num1 + " - " + num2 + "?: ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (num1 - num2 == answer){
            System.out.println("You are correct!");
        }
        else{
            System.out.println("Your answer is wrong, the correct " +
                    "answer is: " + (num1 - num2));
        }
    }
}
