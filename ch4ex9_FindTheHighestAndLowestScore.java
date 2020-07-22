import java.util.Scanner;

/*
Write a program that prompts the user to enter the number
of students and each student’s name and score, and displays the name
of the student with the highest score and the name of user with the lowest score.
 */
public class ch4ex9_FindTheHighestAndLowestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numOfStudents = input.nextInt();
        int student = 1;
        String highestScoreStudentName = "";
        String lowestScoreStudentName = "";
        double highestScore=0;
        double lowestScore=100;


       do{
            Scanner studentsInput = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = studentsInput.next();
            System.out.println("Enter score: ");
            double score = studentsInput.nextDouble();
            if (score > highestScore){
                highestScore = score;
                highestScoreStudentName = name;
            }
            if (score < lowestScore){
                lowestScore = score;
                lowestScoreStudentName = name;
            }
            student++;
        }while(student <= numOfStudents);


       /* while(student <= numOfStudents){
            Scanner studentsInput = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = studentsInput.next();
            System.out.println("Enter score: ");
            double score = studentsInput.nextDouble();
            if (score > highestScore){
                highestScore = score;
                highestScoreStudentName = name;
            }
            if (score < lowestScore){
                lowestScore = score;
                lowestScoreStudentName = name;
            }
            student++;
        }*/

        /*for(student=1; student <= numOfStudents; student++){
            Scanner studentsInput = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = studentsInput.next();
            System.out.println("Enter score: ");
            double score = studentsInput.nextDouble();
            if (score > highestScore){
                highestScore = score;
                highestScoreStudentName = name;
            }
            if (score < lowestScore){
                lowestScore = score;
                lowestScoreStudentName = name;
            }
        }*/

        System.out.println("Highest score: " + highestScoreStudentName + " " + highestScore);
        System.out.println("Lowest score: " + lowestScoreStudentName + " " + lowestScore);
    }
}
