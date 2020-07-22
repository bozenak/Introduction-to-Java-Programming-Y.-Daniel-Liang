import java.util.Scanner;

/*
In business applications, you
are often asked to compute the mean and standard deviation of data. The mean is
simply the average of the numbers. The standard deviation is a statistic that tells
you how tightly all the various data are clustered around the mean in a set of data.
For example, what is the average age of the students in a class? How close are the
ages? If all the students are the same age, the deviation is 0.

Write a program that prompts the user to enter ten numbers, and displays the
mean and standard deviations of these numbers using the following formula:

mean = (x1 + x2 + ... + xn) /n

Here is a sample run:
Enter ten numbers: 1 2 3 4.5 5.6 6 7 8 9 10
The mean is 5.61
The standard deviation is 2.99794

 */
public class ch4ex47_StatisticsComputeMeanAndStandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();
        double num6 = input.nextDouble();
        double num7 = input.nextDouble();
        double num8 = input.nextDouble();
        double num9 = input.nextDouble();
        double num10 = input.nextDouble();

        double mean,standardDeviation, num = 0, countNum=0, sum, meanSum;

        mean = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10;

        System.out.println("mean =  " + mean);

        double deviationArg1 = Math.pow(num1 - mean,2);
        double deviationArg2 = Math.pow(num2 - mean,2);
        double deviationArg3 = Math.pow(num3 - mean,2);
        double deviationArg4 = Math.pow(num4 - mean,2);
        double deviationArg5 = Math.pow(num5 - mean,2);
        double deviationArg6 = Math.pow(num6 - mean,2);
        double deviationArg7 = Math.pow(num7 - mean,2);
        double deviationArg8 = Math.pow(num8 - mean,2);
        double deviationArg9 = Math.pow(num9 - mean,2);
        double deviationArg10 = Math.pow(num10 - mean,2);

        meanSum = (deviationArg1 + deviationArg2 + deviationArg3 + deviationArg4 +
                deviationArg5 + deviationArg6 + deviationArg7 + deviationArg8 +
                deviationArg9 + deviationArg10) / 10;



        standardDeviation = Math.sqrt(meanSum);

        System.out.println("standard deviation =  " + standardDeviation);




        /*for(int i=0; i<=9; i++){
            num = input.nextDouble();
            sum = sum + num;
            countNum++;
        }
        mean = sum / countNum;
        System.out.println("mean =  " + mean); */
    }
}
