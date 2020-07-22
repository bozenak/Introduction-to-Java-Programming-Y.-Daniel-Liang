/*
Pi can be computed using the following summation:
m(i) = 4*(1 - 1/3 + 1/5 + 1/7 + 1/9 - 1/11 + ... + (-1)^i+1 / 2i-1)
Write a method that returns m(i) for a given i and write a test program that
displays the following table:
I       m(i)
--------------------
1       4.0000
101     3.1515
201     3.1466
301     3.1449
401     3.1441
501     3.1436
601     3.1433
701     3.1430
801     3.1428
901     3.1427
 */
public class ch5ex14_EstimatePi {
    public static void main(String[] args) {
        System.out.println("I       m(i)");
        System.out.println("-----------------");
        int start = 1;
        int end = 901;

        for (int i = start; i <= end; i += 100) {
            System.out.printf("%-8d", i);
            System.out.printf("%.4f\n", CalculatePi(i));

        }
    }

    public static double CalculatePi(double n) {
        double pi = 0;
        for (double i = 1; i <= n; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        pi *= 4;
        return pi;
    }

}
