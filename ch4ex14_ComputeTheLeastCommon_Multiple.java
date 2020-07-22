import java.util.Scanner;

/*
Write a program that prompts the user to enter two positive integers,
and displays their least common multiple(LCM).
Hint:
let n1 and n2 be the numbers entered by user.
Their least common multiple is the smallest number that is divisible by both n1 and n2.
 */
public class ch4ex14_ComputeTheLeastCommon_Multiple {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.println("Enter two positive integers: ");
    int n1 = input.nextInt();
    int n2 = input.nextInt();

    int lcm; // least common multiple initial 1
        lcm = (n1 > n2) ? n1 : n2;

   while(true) { // always true
       if (lcm % n1 == 0 && lcm % n2 == 0) {
           System.out.print(lcm);
           break;
       }
       lcm++;
   }






    }
}

