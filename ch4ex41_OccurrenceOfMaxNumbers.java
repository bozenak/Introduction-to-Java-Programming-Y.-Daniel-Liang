import java.util.Scanner;

/*
Write a program that reads integers, finds the largest of them,
and counts its occurrences.
Assume that the input ends with number 0.
Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
is 5 and the occurrence count for 5 is 4.
(Hint: Maintain two variables, max and count. max stores the current max number,
and count stores its occurrences.
Initially, assign the first number to max and 1 to count.
Compare each subsequent number with max.
If the number is greater than max, assign it to max and reset count to 1.
If the number is equal to max, increment count by 1.)


Enter numbers: 3 5 2 5 5 5 0
The largest number is 5
The occurrence count of the largest number is 4
 */
public class ch4ex41_OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer numbers: ");
        int num = input.nextInt();
        int maxNum = num;
        int count = 1;

        while (num != 0){
            num = input.nextInt();
            if(num > maxNum) {
                maxNum = num;
                count = 1;
            }
            else if (num == maxNum){
                count++;
            }

        }
        System.out.println("Max number is: " + maxNum);
        System.out.println("It occurs " + count + " times.");
    }
}
