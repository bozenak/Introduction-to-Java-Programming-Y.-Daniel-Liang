import java.util.Scanner;

/*
Write a program that displays all numbers divisible by 3 and by 4 within the range
entered by user, displays 5 numbers per line. Numbers  are separated by exactly 2 spaces.
 */
public class ch4ex10_FindNumbersDivisibleBy3And4 {
    public static void main(String[] args) {
        final int NUMBER_IN_LINE = 5;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter lower and upper bound: ");
        int lowerBound = input.nextInt();
        int upperBound = input.nextInt();
        int num;


        for(num = lowerBound; num <= upperBound; num++){
            //test if the number divisible by 3 and 4
            if(num % 3 == 0 && num % 4 == 0){
                count++;
                if (count % NUMBER_IN_LINE == 0){
                    System.out.println(num);
                }
                else{
                    System.out.printf( num + "  ");
                }
            }
        }
    }

}

